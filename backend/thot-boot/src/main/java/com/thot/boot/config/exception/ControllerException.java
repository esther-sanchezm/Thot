package com.thot.boot.config.exception;

import com.thot.boot.config.exception.model.ThotException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.util.Collections;

import static com.thot.boot.config.exception.model.error.ThotError.THOT_002;

/**
 * The type Controller advisor class.
 */
@Slf4j
@ControllerAdvice
public class ControllerException extends ResponseEntityExceptionHandler {


    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleBadRequestException(final ConstraintViolationException ex, final WebRequest request) {
        ThotException thotException = new ThotException(THOT_002, Collections.singletonList(ex.getMessage()));
        return handleExceptionInternal(ex, thotException, new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
    }
}
