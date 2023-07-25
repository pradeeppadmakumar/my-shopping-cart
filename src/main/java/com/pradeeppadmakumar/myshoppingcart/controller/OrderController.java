package com.pradeeppadmakumar.myshoppingcart.controller;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import com.pradeeppadmakumar.myshoppingcart.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    public List<OrderDTO> getOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{orderId}")
    public OrderDTO getOrders(@PathVariable("orderId") Long orderId) {
        return orderService.getOrder(orderId);
    }

    @PostMapping
    public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO order) {
        OrderDTO orderResponseBody = orderService.createOrder(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(orderResponseBody);
    }

    @PutMapping("/{orderId}")
    public ResponseEntity<OrderDTO> updateOrder(@PathVariable("orderId") Long orderId, @RequestBody OrderDTO order) {
        OrderDTO orderResponseBody = orderService.updateOrder(order);
        return ResponseEntity.status(HttpStatus.OK).body(orderResponseBody);
    }

    @DeleteMapping("/{orderId}")
    public ResponseEntity deleteOrder(@PathVariable("orderId") Long orderId) {
        boolean isDeleted = orderService.deleteOrder(orderId);
        if(isDeleted){
            return ResponseEntity.status(HttpStatus.OK).build();
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}
