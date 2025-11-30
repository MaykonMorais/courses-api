package com.moraism.courses_api.dto;

import com.moraism.courses_api.model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateAccountRequestDTO(
        @NotBlank(message = "Campo Obrigatório")
        @Size(min = 2, max = 100, message = "Campo deve ter entre 2 e 100 caracteres")
        String name,

        @Email
        String email,

        @NotBlank(message = "Campo Obrigatório")
        @Size(min = 5, max = 50, message = "Senha deve ter entre 5 e 50 caracteres")
        String password,

        @NotBlank(message = "Campo Obrigatório")
        Role role
) {
}
