package com.auth.api.master.service;

import com.auth.core.domain.UserEntity;
import com.auth.core.domain.UserLoginHistoryEntity;

public interface UserLoginHistoryService {
    UserLoginHistoryEntity create(UserEntity user, String accessIp);
}
