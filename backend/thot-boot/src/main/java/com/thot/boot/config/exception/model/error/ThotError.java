package com.thot.boot.config.exception.model.error;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
public enum ThotError {

    THOT_001("THOT_001","This code is not implemented yet", HttpStatus.NOT_IMPLEMENTED),

    THOT_002("THOT_002","Some arguments aren't valid", HttpStatus.BAD_REQUEST);


    private final String code;

    private final String description;

    private final HttpStatus status;
}
