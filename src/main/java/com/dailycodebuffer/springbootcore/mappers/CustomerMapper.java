package com.dailycodebuffer.springbootcore.mappers;

import com.dailycodebuffer.springbootcore.dto.CustomerDto;
import com.dailycodebuffer.springbootcore.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {
    CustomerMapper CUSTOMER_MAPPER = Mappers.getMapper(CustomerMapper.class);

    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(CustomerDto customerDto);
}
