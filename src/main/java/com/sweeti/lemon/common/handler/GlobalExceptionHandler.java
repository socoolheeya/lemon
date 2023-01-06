package com.sweeti.lemon.common.handler;


import com.sweeti.lemon.common.constant.LemonErrorStatus;
import com.sweeti.lemon.common.error.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ Exception.class })
    protected ResponseEntity<ErrorMessage> handleServerException(Exception ex) {
        if(ex instanceof MethodArgumentNotValidException
                || ex instanceof MethodArgumentTypeMismatchException
                || ex instanceof IllegalArgumentException
                || ex instanceof IllegalStateException
                || ex instanceof HttpMessageNotReadableException) {
            ErrorMessage errorMessage = ErrorMessage.builder()
                    .name(LemonErrorStatus.BAD_REQUEST.getName())
                    .number(LemonErrorStatus.BAD_REQUEST.getCode())
                    .statusCode(LemonErrorStatus.BAD_REQUEST.getStatusCode())
                    .message(LemonErrorStatus.BAD_REQUEST.getMessage())
                    .build();

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorMessage);

        } else {
            ex.printStackTrace();
        }

        ErrorMessage errorMessage = ErrorMessage.builder()
                .name(LemonErrorStatus.SERVER_ERROR.getName())
                .number(LemonErrorStatus.SERVER_ERROR.getCode())
                .statusCode(LemonErrorStatus.SERVER_ERROR.getStatusCode())
                .message(LemonErrorStatus.SERVER_ERROR.getMessage())
                .build();

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorMessage);
    }
}
