package com.auth.api.master.facade;

import com.auth.api.common.application.dto.TokenDto;
import com.auth.api.master.application.dto.LoginRequest;
import jakarta.servlet.http.HttpServletRequest;

public interface AuthFacade {
    TokenDto login(HttpServletRequest httpRequest, LoginRequest request);
}
