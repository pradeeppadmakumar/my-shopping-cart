package com.pradeeppadmakumar.myshoppingcart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Order {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany
    private Set<Item> items = new HashSet<>();

    private Instant createdTime;
    private Instant lastUpdatedTime;

}
