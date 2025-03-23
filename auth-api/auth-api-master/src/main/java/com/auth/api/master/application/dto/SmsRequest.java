package com.auth.api.master.application.dto;

public record SmsRequest(
        String phone,
        String code
) {
    public boolean valid(String storedCode) {
        return storedCode.equals(code);
    }
}
