package com.auth.common.utils;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public class VerificationCodeGenerator {
    public static String generateCode() {
        int code = new Random().nextInt(1_000_000); // 0 ~ 999999
        return String.format("%06d", code);
    }
}
