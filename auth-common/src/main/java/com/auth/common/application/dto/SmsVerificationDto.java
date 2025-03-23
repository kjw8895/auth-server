package com.auth.common.application.dto;

import com.auth.common.code.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SmsVerificationDto implements Serializable {
    private String code;
    private VerificationStatus status;

    public void success() {
        this.status = VerificationStatus.SUCCESS;
    }

    public static SmsVerificationDto toDto(String code, VerificationStatus status) {
        return new SmsVerificationDto(code, status);
    }
}
