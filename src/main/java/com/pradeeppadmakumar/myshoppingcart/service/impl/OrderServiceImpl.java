package com.pradeeppadmakumar.myshoppingcart.service.impl;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.mapper.OrderMapper;
import com.pradeeppadmakumar.myshoppingcart.repository.OrderRepository;
import com.pradeeppadmakumar.myshoppingcart.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderDTO> getOrders() {
        log.info("Get all orders");
        return orderMapper.orderListToOrderDtoList(orderRepository.findAll());
    }

    @Override
    public OrderDTO getOrderById(UUID orderId) {
        log.info("retrieve order details of orderId: {}", orderId);
        return orderMapper.orderToOrderDTO(orderRepository.findById(orderId).orElse(null));
    }

    @Override
    @Transactional
    public OrderDTO createOrder(OrderDTO orderDTO) {
        log.info("Creating new Order");
        return orderMapper.orderToOrderDTO(
                orderRepository.save(
                        orderMapper.orderDtoToOrder(orderDTO)
                )
        );
    }

    @Override
    @Transactional
    public OrderDTO updateOrder(UUID orderId, OrderDTO orderDTO) {
        log.info("received request to update the order of orderId: {}", orderDTO.getId());
        AtomicReference<OrderDTO> atomicReference = new AtomicReference<>();

        orderRepository.findById(orderId).ifPresentOrElse((order -> {
                    //order.setProductName(orderDTO.getProductName());
                    atomicReference.set(orderMapper.orderToOrderDTO(orderRepository.save(order)));
                    log.info("Updated the order for orderId: {}", order.getId());
                }),
                () -> {
                    log.info("order for orderId: {} is not found in DB", orderDTO.getId());
                    atomicReference.set(null);
                }
        );

        return atomicReference.get();
    }

    @Override
    @Transactional
    public Boolean deleteOrder(UUID orderId) {
        if(orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            log.info("Order deleted for orderId: {}", orderId);
            return true;
        }
        log.info("Order for orderId: {} is not found in db", orderId);
        return false;
    }
}
