package com.pradeeppadmakumar.myshoppingcart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity nullPointerExceptionHandler() {
        return ResponseEntity.notFound().build();
    }
}
