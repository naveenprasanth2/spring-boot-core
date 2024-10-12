package com.dailycodebuffer.springbootcore.advice;

import com.dailycodebuffer.springbootcore.model.ErrorModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(BusinessException1.class)
    public ResponseEntity<ErrorModel> handleBusinessException(BusinessException1 e) {
        return new ResponseEntity<>(new ErrorModel(e.getCode(), e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
