package com.auth.api.master.controller;

import com.auth.api.master.application.dto.SmsRequest;
import com.auth.api.master.facade.SmsFacade;
import com.auth.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/sms")
public class SmsController {
    private final SmsFacade facade;

    @PostMapping(value = "/send")
    public ResponseEntity<CommonResponse<Boolean>> sendSms(@RequestBody SmsRequest request) {
        facade.send(request);

        return CommonResponse.ok(true);
    }
    @PostMapping(value = "/verify")
    public ResponseEntity<CommonResponse<Boolean>> verify(@RequestBody SmsRequest request) {
        return CommonResponse.ok(facade.verify(request));
    }
}
