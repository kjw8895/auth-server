//package com.auth.api.master.config;
//
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//@Component
//public class CustomAuthenticationProvider implements AuthenticationProvider {
//
//    private final UserDetailsService customUserDetailsService;
//    private final BCryptPasswordEncoder passwordEncoder;
//
//    public CustomAuthenticationProvider(UserDetailsService customUserDetailsService, BCryptPasswordEncoder passwordEncoder) {
//        this.customUserDetailsService = customUserDetailsService;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    @Transactional
//    public Authentication authenticate(Authentication authentication) {
//        if (authentication == null) {
//            throw new RuntimeException("Authentication is null");
//        }
//
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        UserDetails user = customUserDetailsService.loadUserByUsername(username);
//
//        if (!passwordEncoder.matches(password, user.getPassword())) {
//            throw new RuntimeException("Password does not match");
//        }
//
//        if (!user.isEnabled()) {
//            throw new RuntimeException("User is not enabled");
//        }
//
//        return new UsernamePasswordAuthenticationToken(username, password, user.getAuthorities());
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}