package com.pradeeppadmakumar.myshoppingcart.dto;

import com.pradeeppadmakumar.myshoppingcart.entity.Item;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
public class OrderDTO {

    private Long orderId;

    private Set<ItemDTO> items = new HashSet<>();

    private Instant createdTime;
    private Instant lastUpdatedTime;
}
