package com.moraism.courses_api.common;

import com.moraism.courses_api.dto.ErrorField;
import com.moraism.courses_api.dto.ErrorResponse;
    import com.moraism.courses_api.exceptions.UserAlreadyExistsException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Stream;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleUserAlreadyExistsException(UserAlreadyExistsException exception) {
        return ErrorResponse.conflict(exception.getMessage());
    }
    
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        Stream<ErrorField> errorFields = exception.getFieldErrors().stream().map(fieldError -> {
            return new ErrorField(fieldError.getField(), fieldError.getDefaultMessage());
        });

        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), "Erro durante validações", errorFields.toList());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleGenericErrors(RuntimeException exception) {
        return new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Ops, um erro inesperado ocorreu.",
                List.of()
        );
    }
}
