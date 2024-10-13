package com.dailycodebuffer.springbootcore.dto;

import com.dailycodebuffer.springbootcore.validators.UniqueEmailValidator;
import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerDto {
    @NotBlank(message = "Please enter a valid first name")
    @NotEmpty(message = "Please enter some value to the fields")
    private String firstName;
    @NotEmpty(message = "Please enter some value to the fields")
    @NotBlank(message = "Please enter a valid last name")
    private String lastName;
    @Email(message = "Please enter a valid email name")
    @NotEmpty(message = "Please enter some value to the fields")
    @UniqueEmailValidator(message = "Please enter a unique email")
    private String email;
    @Positive(message = "Please enter a valid positive number")
    @Min(value = 6_000_000_000L, message = "Please enter a number above 6_000_000_000L")
    @Max(value = 9_999_999_999L, message = "Please enter a number below 9_999_999_999L")
    private long phoneNumber;
}
