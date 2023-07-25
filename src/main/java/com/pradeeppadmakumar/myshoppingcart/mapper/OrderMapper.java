package com.pradeeppadmakumar.myshoppingcart.mapper;

import com.pradeeppadmakumar.myshoppingcart.dto.ItemDTO;
import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Item;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {

    public OrderDTO orderToOrderDto(Order order);
    public Order orderDtoToOrder(OrderDTO order);
    public ItemDTO itemToItemDto(Item item);
    public Item itemDtoToItem(ItemDTO itemDto);

}
