package com.auth.api.master.facade.impl;

import com.auth.api.common.application.dto.TokenDto;
import com.auth.api.master.application.dto.LoginRequest;

public interface AuthFacade {
    TokenDto login(LoginRequest request);
}
