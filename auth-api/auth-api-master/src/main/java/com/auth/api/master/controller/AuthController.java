package com.auth.api.master.controller;

import com.auth.api.common.application.dto.TokenDto;
import com.auth.api.master.application.dto.LoginRequest;
import com.auth.api.master.facade.AuthFacade;
import com.auth.common.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthController {
    private final AuthFacade facade;

    @PostMapping(value = "/sign-in")
    public ResponseEntity<CommonResponse<TokenDto>> signIn(@RequestBody LoginRequest request) {
        TokenDto dto = facade.login(request);
        return CommonResponse.ok(dto);
    }
}
