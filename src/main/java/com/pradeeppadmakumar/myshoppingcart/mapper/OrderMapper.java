package com.pradeeppadmakumar.myshoppingcart.mapper;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    public OrderDTO orderToOrderDTO(Order order);

    public Order orderDtoToOrder(OrderDTO orderDTO);

    public List<OrderDTO> orderListToOrderDtoList(List<Order> orderList);
}
