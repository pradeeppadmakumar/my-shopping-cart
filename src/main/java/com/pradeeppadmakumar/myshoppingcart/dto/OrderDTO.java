package com.pradeeppadmakumar.myshoppingcart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class OrderDTO {

    private UUID id;

    @JsonIgnore
    private Integer version;

    private Instant createTimestamp;

    private Instant updateTimestamp;
}
