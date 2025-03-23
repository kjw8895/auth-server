package com.auth.api.master.config;

import com.auth.api.common.config.WebMvcConfig;
import com.auth.client.redisson.config.RedissonConfig;
import com.auth.core.config.AuthCoreConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({AuthCoreConfig.class, WebMvcConfig.class, RedissonConfig.class})
@ComponentScan(value = {
        "com.auth.client.redisson",
        "com.auth.api.common"
})
public class AuthApiMasterConfig {
}
