package com.auth.api.master.config.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("auth")
public class AuthProperties {
    private Long codeExpirationTime;
    private Long verityExpirationTime;
}
