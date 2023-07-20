package com.pradeeppadmakumar.myshoppingcart.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @GetMapping("/order")
    public String getOrders() {
        return "List of orders";
    }

    @GetMapping("/order/{orderId}")
    public String getOrders(@PathVariable("orderId") String orderId) {
        return "Order : " + orderId;
    }

    @PostMapping("/order")
    public ResponseEntity<String> createOrder(@RequestBody String body) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Created");
    }

    @PutMapping("/order/{orderId}")
    public ResponseEntity<String> update(@PathVariable("orderId") String orderId, @RequestBody String body) {
        return ResponseEntity.status(HttpStatus.OK).body("Updated");
    }

}
