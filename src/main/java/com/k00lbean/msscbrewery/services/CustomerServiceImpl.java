package com.k00lbean.msscbrewery.services;

import com.k00lbean.msscbrewery.web.models.CustomerDto;

import java.util.UUID;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
