package com.moraism.courses_api.dto;

import com.moraism.courses_api.model.Role;

public record CreateAccountRequestDTO(
        String name,
        String email,
        String password,
        Role role
) {
}
