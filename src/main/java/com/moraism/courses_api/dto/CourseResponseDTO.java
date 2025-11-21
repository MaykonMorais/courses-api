package com.moraism.courses_api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponseDTO {
    private UUID id;
    private String name;
    private String category;
    private String active;
}
