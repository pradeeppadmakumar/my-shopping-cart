package com.pradeeppadmakumar.myshoppingcart.controller;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import com.pradeeppadmakumar.myshoppingcart.service.OrderService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<OrderDTO> getAllOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/{orderId}")
    public OrderDTO getOrderById(@PathVariable UUID orderId) {
        return orderService.getOrderById(orderId);
    }

    @PostMapping
    public OrderDTO createOrder(@Validated @RequestBody OrderDTO order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/{orderId}")
    public OrderDTO updateOrder(@PathVariable UUID orderId, @Validated @RequestBody OrderDTO order) {
        return orderService.updateOrder(orderId, order);
    }

    @DeleteMapping("/{orderId}")
    public Boolean deleteOrder(@PathVariable UUID orderId) {
        return orderService.deleteOrder(orderId);
    }

}
