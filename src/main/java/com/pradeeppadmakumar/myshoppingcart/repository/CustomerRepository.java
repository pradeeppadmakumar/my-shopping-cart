package com.pradeeppadmakumar.myshoppingcart.repository;

import com.pradeeppadmakumar.myshoppingcart.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
