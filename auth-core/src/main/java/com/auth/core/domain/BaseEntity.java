package com.auth.core.domain;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @CreatedDate
    @Column(name = "created_datetime", updatable = false)
    private LocalDateTime createdDatetime;

    @LastModifiedDate
    @Column(name = "modified_datetime")
    private LocalDateTime modifiedDatetime;

    @Version
    @Column(name = "version")
    private Long version;
}
