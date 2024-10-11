package com.dailycodebuffer.springbootcore.course;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Course {
    private long id;
    private String name;
    private String author;
}
