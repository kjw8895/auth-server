package com.auth.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum UserStatus implements CodeEnum {
    ACTIVATION("ACTIVATE"),
    SUSPENDED("SUSPENDED"),
    DORMANCY("DORMANCY"),
    WITHDRAWAL("WITHDRAWAL");

    private final String text;
}
