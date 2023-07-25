package com.pradeeppadmakumar.myshoppingcart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    private UUID id;

    @Version
    private Integer version;

    @CreationTimestamp
    private Instant createTimestamp;

    @UpdateTimestamp
    private Instant updateTimestamp;

    @ManyToOne
    @NotNull
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "ORDERS_PRODUCTS", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    @Builder.Default
    private Set<Product> products = new HashSet<>();

}
