package com.itschool.library.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itschool.library.models.dtos.ResponseCustomerDTO;
import com.itschool.library.models.entities.Customer;
import com.itschool.library.respositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

   private final ObjectMapper objectMapper;
   private final CustomerRepository customerRepository;

    public CustomerServiceImpl(ObjectMapper objectMapper, CustomerRepository customerRepository) {
        this.objectMapper = objectMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public ResponseCustomerDTO createCustomer(ResponseCustomerDTO responseCustomerDTO) {
        Customer customerEntity = objectMapper.convertValue(responseCustomerDTO, Customer.class);
        Customer customerEntityResponse = customerRepository.save(customerEntity);
        log.info("Customer with id {} was saved",customerEntityResponse.getId());
        
        return objectMapper.convertValue(customerEntityResponse, ResponseCustomerDTO.class);
    }
}
