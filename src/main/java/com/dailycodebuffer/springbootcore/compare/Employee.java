package com.dailycodebuffer.springbootcore.compare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee implements Comparable<Employee> {
    private String name;
    private int age;

    @Override
    public int compareTo(Employee o) {
        return o.getName().compareTo(this.name);
    }
}
