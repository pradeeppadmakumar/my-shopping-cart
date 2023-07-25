package com.pradeeppadmakumar.myshoppingcart.service;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;

import java.util.List;
import java.util.UUID;

public interface OrderService {

    public List<OrderDTO> getOrders();

    public OrderDTO getOrderById(UUID orderId);

    public OrderDTO createOrder(OrderDTO orderDTO);

    public OrderDTO updateOrder(UUID orderId, OrderDTO orderDTO);

    public Boolean deleteOrder(UUID orderId);
}
