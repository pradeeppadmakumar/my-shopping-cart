package com.pradeeppadmakumar.myshoppingcart.service.impl;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Item;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import com.pradeeppadmakumar.myshoppingcart.mapper.OrderMapper;
import com.pradeeppadmakumar.myshoppingcart.repository.ItemRepository;
import com.pradeeppadmakumar.myshoppingcart.repository.OrderRepository;
import com.pradeeppadmakumar.myshoppingcart.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    public final OrderRepository orderRepository;
    public final ItemRepository itemRepository;

    public final OrderMapper orderMapper;

    @Override
    public OrderDTO createOrder(OrderDTO order) {
        Order orderDb = orderMapper.orderDtoToOrder(order);

        /*Set<Item> items = orderDb.getItems().stream().map((item) -> {
            return itemRepository.save(item);
        }).collect(Collectors.toSet());

        orderDb.setItems(items);*/

        orderDb = orderRepository.save(orderDb);


        return null;
    }

    @Override
    public OrderDTO updateOrder(OrderDTO order) {
        return null;
    }

    @Override
    public OrderDTO getOrder(Long id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public boolean deleteOrder(Long id) {
        return false;
    }
}