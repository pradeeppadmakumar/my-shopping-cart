package com.pradeeppadmakumar.myshoppingcart.runner;

import com.pradeeppadmakumar.myshoppingcart.dto.ItemDTO;
import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
@RequiredArgsConstructor
@Slf4j
public class Runner implements CommandLineRunner {

    private final OrderService orderService;

    @Override
    public void run(String... args) throws Exception {

        ItemDTO item1 = ItemDTO.builder()
                .itemName("item 1")
                .build();

        Set<ItemDTO> items = new HashSet<>();
        items.add(item1);

        OrderDTO orderDTO = OrderDTO.builder()
                .items(items)
                .build();

        orderService.createOrder(orderDTO);
    }
}
