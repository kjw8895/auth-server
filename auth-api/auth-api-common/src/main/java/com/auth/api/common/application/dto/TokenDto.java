package com.auth.api.common.application.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TokenDto implements Serializable {
    private String accessToken;
    private String refreshToken;
}
