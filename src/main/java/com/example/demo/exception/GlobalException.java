package com.example.demo.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@RestController
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public 
}