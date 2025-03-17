//package com.auth.core.domain;
//
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.time.Instant;
//
//@Entity
//@Table(name = "OAUTH2_REGISTERED_CLIENT")
//@Getter
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//@AllArgsConstructor
//public class CustomClient {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private String id;
//
//    @Column(name = "client_id")
//    private String clientId;
//
//    @Column(name = "client_secret")
//    private String clientSecret;
//
//    @Column(name = "client_secret_expires_at")
//    private Instant clientSecretExpiresAt;
//
//    @Column(name = "client_name")
//    private String clientName;
//
//    @Column(name = "authorization_grant_types")
//    private String authorizationGrantTypes;
//
//    @Column(name = "redirect_uris")
//    private String redirectUris;
//
//    @Column(name = "scopes")
//    private String scopes;
//
//    @Column(name = "client_authentication_methods")
//    private String clientAuthenticationMethods;
//
//}
