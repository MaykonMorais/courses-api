package com.moraism.courses_api.dto;

import lombok.Data;

@Data
public class ErrorField {
    private String field;
    private String error;
}
