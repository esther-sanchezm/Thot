package com.thot.boot.config.exception.model.error;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

public enum ThotError {

    THOT_001("THOT_001","This code is not implemented yet", HttpStatus.NOT_IMPLEMENTED),

    THOT_002("THOT_002","Some arguments aren't valid", HttpStatus.BAD_REQUEST);

    private final String code;

    private final String description;

    private final HttpStatus httpStatus;

     ThotError(final String code, final String description, final HttpStatus httpStatus){
        this.code = code;
        this.description = description;
        this.httpStatus = httpStatus;
    }


   // private HttpStatus status;
}
