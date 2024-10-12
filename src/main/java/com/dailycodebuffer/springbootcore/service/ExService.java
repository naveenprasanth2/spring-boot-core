package com.dailycodebuffer.springbootcore.service;

import com.dailycodebuffer.springbootcore.course.Course;
import com.dailycodebuffer.springbootcore.exceptions.BusinessException;
import com.dailycodebuffer.springbootcore.repository.ExRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ExService {
    private final ExRepository exRepository;

    public Course getCourseById(long courseId) {
        return exRepository.findById(courseId)
                .orElseThrow(() -> new BusinessException(601, "No such values with " + courseId + " found"));
    }
}
