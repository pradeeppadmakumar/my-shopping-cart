package com.pradeeppadmakumar.myshoppingcart.dto;

import com.pradeeppadmakumar.myshoppingcart.entity.Order;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ItemDTO {

    private Long itemId;

    private String itemName;

}
