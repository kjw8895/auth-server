package com.auth.api.master.facade.impl;

import com.auth.api.common.application.dto.TokenDto;
import com.auth.api.master.application.dto.LoginRequest;
import com.auth.api.master.config.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class AuthFacadeImpl implements AuthFacade {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;

    @Override
    public TokenDto login(LoginRequest request) {
        // Security 인증
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
        // Business logic

        return jwtTokenProvider.storeToken(authentication);
    }
}
