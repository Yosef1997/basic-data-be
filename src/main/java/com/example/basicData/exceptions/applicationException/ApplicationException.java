package com.example.basicData.exceptions.applicationException;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Setter
@Getter
public class ApplicationException extends RuntimeException {
    private HttpStatus httpStatus;
    private List<String> errors;
    private Object data;

    public ApplicationException(HttpStatus httpStatus, String message, List<String> errors, Object data) {
        super(message);
    }

    public ApplicationException(String message) {
        this(HttpStatus.BAD_REQUEST, message);
    }

    public ApplicationException(HttpStatus httpStatus, String message) {
        this(httpStatus, message, Collections.singletonList(message), null);
    }
}
