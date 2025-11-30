package com.moraism.courses_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CreatedCourseResponseDTO {
    private UUID id;
    private String title;
    private String description;
}
