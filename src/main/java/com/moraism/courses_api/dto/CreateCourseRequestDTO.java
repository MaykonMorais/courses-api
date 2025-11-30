package com.moraism.courses_api.dto;

import jakarta.validation.constraints.NotBlank;

public record CreateCourseRequestDTO(
        @NotBlank(message = "Campo obrigatório")
        String title,

        @NotBlank(message = "Campo obrigatório")
        String description,

        @NotBlank(message = "Campo obrigatório")
        String level
) {
}
