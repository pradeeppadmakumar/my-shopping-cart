package com.pradeeppadmakumar.myshoppingcart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class OrderDTO {

    private UUID id;

    @JsonIgnore
    private Integer version;

    @JsonIgnore
    private Instant createTimestamp;

    @JsonIgnore
    private Instant updateTimestamp;
}
