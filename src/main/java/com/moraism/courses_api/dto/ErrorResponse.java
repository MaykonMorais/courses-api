package com.moraism.courses_api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private Integer status;
    private String message;
    private List<ErrorField> errorFields;
}
