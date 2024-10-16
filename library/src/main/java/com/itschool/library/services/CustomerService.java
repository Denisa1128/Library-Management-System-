package com.itschool.library.services;

import com.itschool.library.models.dtos.ResponseCustomerDTO;

public interface CustomerService {

    ResponseCustomerDTO createCustomer(ResponseCustomerDTO responseCustomerDTO);
}
