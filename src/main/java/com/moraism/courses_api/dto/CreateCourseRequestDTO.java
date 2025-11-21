package com.moraism.courses_api.dto;

public record CreateCourseRequestDTO(
        String name,
        String category,
        String professor
) {
}
