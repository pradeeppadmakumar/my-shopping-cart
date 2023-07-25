package com.pradeeppadmakumar.myshoppingcart.service;

import com.pradeeppadmakumar.myshoppingcart.dto.CustomerDTO;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

    public List<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomerById(UUID customerId);

    public CustomerDTO createCustomer(CustomerDTO customerDTO);

    public CustomerDTO updateCustomer(UUID customerId, CustomerDTO customerDTO);

    public Boolean deleteCustomer(UUID customerId);
}
