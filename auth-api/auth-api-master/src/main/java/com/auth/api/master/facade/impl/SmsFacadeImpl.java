package com.auth.api.master.facade.impl;

import com.auth.api.master.application.dto.SmsRequest;
import com.auth.api.master.config.property.AuthProperties;
import com.auth.api.master.facade.SmsFacade;
import com.auth.api.master.service.SmsService;
import com.auth.client.redisson.service.RedissonClientService;
import com.auth.common.application.dto.SmsVerificationDto;
import com.auth.common.code.CommonExceptionCode;
import com.auth.common.code.VerificationStatus;
import com.auth.common.exception.CommonException;
import com.auth.common.utils.ObjectMapperUtils;
import com.auth.common.utils.VerificationCodeGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableConfigurationProperties({AuthProperties.class})
@Slf4j
public class SmsFacadeImpl implements SmsFacade {
    private final SmsService smsService;
    private final RedissonClientService redissonClientService;
    private final AuthProperties authProperties;

    @Override
    public void send(SmsRequest request) {
        try {
            String code = VerificationCodeGenerator.generateCode();
            smsService.send(request, code);
            String value = ObjectMapperUtils.writeValueAsString(SmsVerificationDto.toDto(code, VerificationStatus.WAITING));
            redissonClientService.put(request.phone(), value, authProperties.getCodeExpirationTime());
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @Override
    public boolean verify(SmsRequest request) {
        boolean result;

        Object message = redissonClientService.get(request.phone());
        if (message == null) {
            throw new CommonException(CommonExceptionCode.VERIFICATION_CODE_NOT_FOUND);
        }
        SmsVerificationDto value = ObjectMapperUtils.readValue(message.toString(), SmsVerificationDto.class);

        result = request.valid(value.getCode());
        if (result) {
            value.success();
            redissonClientService.delete(request.phone());
            redissonClientService.put(request.phone(), ObjectMapperUtils.writeValueAsString(value), authProperties.getVerityExpirationTime());
        }

        return result;
    }
}
