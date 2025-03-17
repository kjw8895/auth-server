package com.auth.common.code;

import org.springframework.http.HttpStatus;

public interface ExceptionCodeEnum {
    int getCode();
    String getMsg();
    HttpStatus getHttpStatus();
}
