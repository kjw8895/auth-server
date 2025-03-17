package com.auth.core.repository.custom.impl;

import com.auth.core.domain.QRoleEntity;
import com.auth.core.domain.QUserEntity;
import com.auth.core.domain.QUserRoleEntity;
import com.auth.core.repository.custom.CustomUserEntityRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomUserEntityRepositoryImpl implements CustomUserEntityRepository {
    private final JPAQueryFactory queryFactory;

    private static final QUserEntity USER = QUserEntity.userEntity;
    private static final QRoleEntity ROLE = QRoleEntity.roleEntity;
    private static final QUserRoleEntity USER_ROLE = QUserRoleEntity.userRoleEntity;

}
