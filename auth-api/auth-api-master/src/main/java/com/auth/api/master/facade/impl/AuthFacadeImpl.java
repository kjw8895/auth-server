package com.auth.api.master.facade.impl;

import com.auth.api.common.application.dto.TokenDto;
import com.auth.api.master.application.dto.LoginRequest;
import com.auth.api.master.config.JwtTokenProvider;
import com.auth.api.master.facade.AuthFacade;
import com.auth.api.master.service.UserLoginHistoryService;
import com.auth.common.utils.HttpServletRequestUtils;
import com.auth.core.domain.UserEntity;
import jakarta.servlet.http.HttpServletRequest;
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
    private final UserLoginHistoryService userLoginHistoryService;

    @Override
    public TokenDto login(HttpServletRequest httpRequest, LoginRequest request) {
        // Security 인증
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.email(), request.password()));
        // Business logic
        UserEntity user = jwtTokenProvider.getUserByAuthentication(authentication);
        userLoginHistoryService.create(user, HttpServletRequestUtils.getClientIpAddress(httpRequest));

        return jwtTokenProvider.storeToken(authentication);
    }
}
