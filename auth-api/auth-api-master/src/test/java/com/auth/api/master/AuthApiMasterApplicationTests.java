package com.auth.api.master;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(value = "local")
class AuthApiMasterApplicationTests {


    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void test() throws Exception {
        String test = passwordEncoder.encode("test");
        System.out.println("test: " + test);
    }

}
