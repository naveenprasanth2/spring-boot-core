package com.dailycodebuffer.springbootcore.compare;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeEval {
    public static void main(String[] args) {
        Employee employee = new Employee("naveen", 22);
        Employee employee1 = new Employee("aaveen", 22);
        System.out.println(employee.compareTo(employee1) == 0);
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getName).reversed();
        Stream.of(employee, employee1).sorted(employeeComparator).map(Employee::getName)
                .forEach(System.out::println);
    }
}
