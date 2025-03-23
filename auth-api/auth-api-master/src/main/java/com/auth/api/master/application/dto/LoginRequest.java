package com.auth.api.master.application.dto;

public record LoginRequest(
        String email,
        String password
) {
}
