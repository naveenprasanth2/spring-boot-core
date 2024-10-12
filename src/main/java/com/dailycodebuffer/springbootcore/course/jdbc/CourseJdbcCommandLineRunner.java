package com.dailycodebuffer.springbootcore.course.jdbc;
//
//import com.dailycodebuffer.springbootcore.course.Course;
//import lombok.AllArgsConstructor;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//@AllArgsConstructor
//public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//    private CourseRepository courseRepository;
//    public void run(String... args) throws Exception {
//        Course course = new Course(1, "Spring Boot", "Spring Boot Course");
//        Course course1 = new Course(2, "Spring Boot Course 1", "Spring Boot Course");
//        Course course2 = new Course(3, "Spring Boot 2", "Spring Boot Course");
//        courseRepository.insert(course);
//        courseRepository.insert(course1);
//        courseRepository.insert(course2);
//        courseRepository.delete(2);
//        System.out.println(courseRepository.selectById(3));
//    }
//}
