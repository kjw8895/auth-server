//package com.auth.core.domain;
//
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.time.Instant;
//
//@Entity
//@Table(name = "OAUTH2_AUTHORIZATION")
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//public class CustomAuthorization {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private String id;
//
//    @Column(name = "principal_name")
//    private String principalName;
//
//    @Column(name = "attributes")
//    private String attributes;
//
//    @Column(name = "registered_client_id")
//    private String registeredClientId;
//
//    @Column(name = "authorization_grant_type")
//    private String authorizationGrantType;
//
//    @Column(name = "state")
//    private String state;
//
//    @Column(name = "authorization_code_value")
//    private String authorizationCodeValue;
//
//    @Column(name = "authorization_code_issued_at")
//    private Instant authorizationCodeIssuedAt;
//
//    @Column(name = "authorization_code_expires_at")
//    private Instant authorizationCodeExpiresAt;
//
//    @Column(name = "access_token_value")
//    private String accessTokenValue;
//
//    @Column(name = "access_token_issued_at")
//    private Instant accessTokenIssuedAt;
//
//    @Column(name = "access_token_expires_at")
//    private Instant accessTokenExpiresAt;
//
//    @Column(name = "access_token_scopes")
//    private String accessTokenScopes;
//
//    @Column(name = "refresh_token_value")
//    private String refreshTokenValue;
//
//    @Column(name = "refresh_token_issued_at")
//    private Instant refreshTokenIssuedAt;
//
//    @Column(name = "refresh_token_expires_at")
//    private Instant refreshTokenExpiresAt;
//}
