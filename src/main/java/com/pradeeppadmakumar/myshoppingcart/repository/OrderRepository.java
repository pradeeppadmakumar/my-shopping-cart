package com.pradeeppadmakumar.myshoppingcart.repository;

import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
