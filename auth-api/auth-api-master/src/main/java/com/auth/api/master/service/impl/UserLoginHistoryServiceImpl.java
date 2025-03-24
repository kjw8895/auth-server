package com.auth.api.master.service.impl;

import com.auth.api.master.service.UserLoginHistoryService;
import com.auth.core.domain.UserEntity;
import com.auth.core.domain.UserLoginHistoryEntity;
import com.auth.core.repository.UserLoginHistoryEntityRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserLoginHistoryServiceImpl implements UserLoginHistoryService {
    private final UserLoginHistoryEntityRepository userLoginHistoryEntityRepository;

    @Override
    public UserLoginHistoryEntity create(UserEntity user, String accessIp) {
        UserLoginHistoryEntity entity = UserLoginHistoryEntity.toEntity(user, accessIp);
        return userLoginHistoryEntityRepository.save(entity);
    }
}
