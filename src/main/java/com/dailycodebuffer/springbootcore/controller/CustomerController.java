package com.dailycodebuffer.springbootcore.controller;

import com.dailycodebuffer.springbootcore.dto.CustomerDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/customer")
    public ResponseEntity<CustomerDto> addCustomer(@Valid @RequestBody CustomerDto customerDto) {
        System.out.println(customerDto);
        return ResponseEntity.ok().body(customerDto);
    }
}
