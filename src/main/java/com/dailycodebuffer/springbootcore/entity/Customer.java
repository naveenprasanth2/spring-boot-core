package com.dailycodebuffer.springbootcore.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;
}
