package com.k00lbean.msscbrewery.services;

import com.k00lbean.msscbrewery.web.models.CustomerDto;

import java.util.UUID;

/**
 * Created by dmm on 2021-07-21
 */
public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
