package com.moraism.courses_api.dto;

import lombok.Data;
import java.util.UUID;

@Data
public class CourseResponseDTO {
    private UUID id;
    private String title;
    private String description;
}
