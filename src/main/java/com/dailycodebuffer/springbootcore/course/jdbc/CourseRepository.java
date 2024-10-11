package com.dailycodebuffer.springbootcore.course.jdbc;

import com.dailycodebuffer.springbootcore.model.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseRepository {
    private JdbcTemplate jdbcTemplate;
    private static String INSERT_QUERY =
            """
            insert into course (id, name, author)
            values (1, 'naveen', 'in28minss')
            """;
    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
}
