package com.dailycodebuffer.springbootcore.controller;

import com.dailycodebuffer.springbootcore.exceptions.BusinessException;
import com.dailycodebuffer.springbootcore.model.ErrorModel;
import com.dailycodebuffer.springbootcore.service.ExService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/error")
@AllArgsConstructor
public class ExHandlingController {
    private final ExService exService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> getCourseById(@PathVariable long id) {
        try {
            return new ResponseEntity<>(exService.getCourseById(id), HttpStatus.ACCEPTED);
        } catch (BusinessException businessException) {
            ErrorModel errorModel = new ErrorModel(businessException.getCode(), businessException.getMessage());
            return new ResponseEntity<>(errorModel, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<?> getCoursesById(@PathVariable long id) {
            return new ResponseEntity<>(exService.getCoursesById(id), HttpStatus.ACCEPTED);
    }
}
