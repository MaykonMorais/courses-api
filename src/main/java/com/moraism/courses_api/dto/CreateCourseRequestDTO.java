package com.moraism.courses_api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCourseRequestDTO(
        @NotBlank(message = "Campo obrigatório")
        String name,

        @NotBlank(message = "Campo obrigatório")
        String category,

        @NotBlank(message = "Campo obrigatório")
        String professor
) {
}
