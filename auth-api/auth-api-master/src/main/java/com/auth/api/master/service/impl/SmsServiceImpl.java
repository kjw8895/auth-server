package com.auth.api.master.service.impl;

import com.auth.api.master.application.dto.SmsRequest;
import com.auth.api.master.service.SmsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SmsServiceImpl implements SmsService {

    @Override
    public void send(SmsRequest request, String value) {
        try {
            // todo : sms 서비스 연동 후 구현
        } catch (Exception e) {
            log.error("Failed to send SMS - request : {}, value : {}", request, value);
            log.error(e.getMessage(), e);
            throw e;
        }
    }
}
