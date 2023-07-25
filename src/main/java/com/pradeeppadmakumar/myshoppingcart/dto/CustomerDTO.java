package com.pradeeppadmakumar.myshoppingcart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class CustomerDTO {

    private UUID id;

    @JsonIgnore
    private Integer version;

    @JsonIgnore
    private Instant createTimestamp;

    @JsonIgnore
    private Instant updateTimestamp;

    @NotNull
    @NotBlank
    private String customerName;

    @Email
    @NotNull
    private String email;
}
