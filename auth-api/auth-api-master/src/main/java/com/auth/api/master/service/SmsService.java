package com.auth.api.master.service;

import com.auth.api.master.application.dto.SmsRequest;

public interface SmsService {
    void send(SmsRequest request, String value);
}
