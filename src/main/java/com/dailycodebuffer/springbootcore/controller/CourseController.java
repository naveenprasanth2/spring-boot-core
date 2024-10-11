package com.dailycodebuffer.springbootcore.controller;

import com.dailycodebuffer.springbootcore.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return List.of(new Course(1, "Spring Boot", "Spring Boot Course")
        , new Course(2, "Spring MVC", "Spring MVC Course"));
    }
}
