package com.ifglife.hackrank.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ifglife.hackrank.response.GlobalError;

public class GlobalExceptionHandler {

    @ExceptionHandler(FizzException.class)
    public ResponseEntity<GlobalError> handleFizzException(FizzException ex) {
        GlobalError error = new GlobalError(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }

    @ExceptionHandler(BuzzException.class)
    public ResponseEntity<GlobalError> handleBuzzException(BuzzException ex) {
        GlobalError error = new GlobalError(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); // 400
    }

    @ExceptionHandler(FizzBuzzException.class)
    public ResponseEntity<GlobalError> handleFizzBuzzException(FizzBuzzException ex) {
        GlobalError error = new GlobalError(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INSUFFICIENT_STORAGE); // 507
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GlobalError> handleAllExceptions(Exception ex) {
        GlobalError error = new GlobalError(ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }
}
