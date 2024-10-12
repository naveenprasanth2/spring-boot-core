package com.dailycodebuffer.springbootcore.course.jdbc;

import com.dailycodebuffer.springbootcore.course.Course;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CourseRepository {
    private JdbcTemplate jdbcTemplate;
    private static final String INSERT_QUERY =
            """
                    insert into course (id, name, author)
                    values (?,?,?)
                    """;
    private static final String DELETE_QUERY = "delete from course where id = ?";
    private static final String SELECT_QUERY = "select * from course where id = ?";

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }

    public Course selectById(long id) {
        return jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
    }
}
