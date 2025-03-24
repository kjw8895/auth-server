package com.auth.core.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_LOGIN_HISTORY")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserLoginHistoryEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @Column(name = "access_ip")
    private String accessIp;

    public static UserLoginHistoryEntity toEntity(UserEntity user, String accessIp) {
        UserLoginHistoryEntity entity = new UserLoginHistoryEntity();
        entity.user = user;
        entity.accessIp = accessIp;

        return entity;
    }
}

