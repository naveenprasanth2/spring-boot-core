package com.dailycodebuffer.springbootcore.controller;

import com.dailycodebuffer.springbootcore.dto.CustomerDto;
import com.dailycodebuffer.springbootcore.marker.PostValidation;
import com.dailycodebuffer.springbootcore.marker.PutValidation;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/customer")
    public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customerDto) {
        System.out.println(customerDto);
        return ResponseEntity.ok().body(customerDto);
    }

    @PostMapping("/customer/custom")
    public ResponseEntity<CustomerDto> addCustomer2(@Validated(PostValidation.class) @RequestBody CustomerDto customerDto) {
        System.out.println(customerDto);
        return ResponseEntity.ok().body(customerDto);
    }

    @PutMapping("/customer/custom")
    public ResponseEntity<CustomerDto> addCustomer3(@Validated(PutValidation.class) @RequestBody CustomerDto customerDto) {
        System.out.println(customerDto);
        return ResponseEntity.ok().body(customerDto);
    }
}
