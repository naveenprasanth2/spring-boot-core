package com.dailycodebuffer.springbootcore.repository;

import com.dailycodebuffer.springbootcore.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExRepository extends JpaRepository<Course, Long> {
}
