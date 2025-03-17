package com.auth.core.repository;

import com.auth.core.domain.UserEntity;
import com.auth.core.repository.custom.CustomUserEntityRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long>, CustomUserEntityRepository {
    Optional<UserEntity> findByEmail(String email);
}
