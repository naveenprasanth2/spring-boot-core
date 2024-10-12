package com.dailycodebuffer.springbootcore.advice;

import com.dailycodebuffer.springbootcore.model.ErrorModel;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException1.class)
    public ResponseEntity<ErrorModel> handleBusinessException(BusinessException1 e) {
        return new ResponseEntity<>(new ErrorModel(e.getCode(), e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        ErrorModel errorModel = new ErrorModel(HttpStatus.NOT_FOUND.value(), "summa");
        return new ResponseEntity<>(errorModel, HttpStatus.NOT_FOUND);
    }
}
