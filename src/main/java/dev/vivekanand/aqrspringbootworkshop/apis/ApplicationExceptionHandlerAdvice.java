package dev.vivekanand.aqrspringbootworkshop.apis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationExceptionHandlerAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationExceptionHandlerAdvice.class);

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Void> handleIllegalArgumentException(IllegalArgumentException e) {
        LOGGER.warn("Exception caught: " + e.getMessage(), e);
        return ResponseEntity.badRequest().build();
    }
}
