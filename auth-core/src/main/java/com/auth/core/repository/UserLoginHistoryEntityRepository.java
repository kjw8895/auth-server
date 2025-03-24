package com.auth.core.repository;

import com.auth.core.domain.UserLoginHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginHistoryEntityRepository extends JpaRepository<UserLoginHistoryEntity, Long> {
}
