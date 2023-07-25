package com.pradeeppadmakumar.myshoppingcart.service;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    public OrderDTO createOrder(OrderDTO order);

    public OrderDTO updateOrder(OrderDTO order);

    public OrderDTO getOrder(Long id);

    public List<OrderDTO> getAllOrders();

    public boolean deleteOrder(Long id);

}