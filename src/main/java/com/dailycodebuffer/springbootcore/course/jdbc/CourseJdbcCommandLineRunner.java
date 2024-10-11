package com.dailycodebuffer.springbootcore.course.jdbc;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    private CourseRepository courseRepository;
    public void run(String... args) throws Exception {
        courseRepository.insert();
    }
}
