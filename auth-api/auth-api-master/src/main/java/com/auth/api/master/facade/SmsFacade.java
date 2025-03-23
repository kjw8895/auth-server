package com.auth.api.master.facade;

import com.auth.api.master.application.dto.SmsRequest;

public interface SmsFacade {
    void send(SmsRequest request);
    boolean verify(SmsRequest request);
}
