package com.pradeeppadmakumar.myshoppingcart.bootstrap;

import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Customer;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import com.pradeeppadmakumar.myshoppingcart.entity.Product;
import com.pradeeppadmakumar.myshoppingcart.repository.CustomerRepository;
import com.pradeeppadmakumar.myshoppingcart.repository.OrderRepository;
import com.pradeeppadmakumar.myshoppingcart.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Customer customer1 = Customer.builder()
                .email("customer1@gmail.com")
                .customerName("Test Customer1")
                .build();

        Customer customer2 = Customer.builder()
                .email("customer2@gmail.com")
                .customerName("Test Customer2")
                .build();

        Customer savedCustomer1 = customerRepository.save(customer1);
        Customer savedCustomer2 = customerRepository.save(customer2);

        Product product1 = Product.builder()
                .productName("product 1")
                .productDescription("First Product")
                .build();

        Product product2 = Product.builder()
                .productName("product 2")
                .productDescription("Second Product")
                .build();

        Product savedProduct1 = productRepository.save(product1);
        Product savedProduct2 = productRepository.save(product2);


        Order order1 = Order.builder()
                .customer(savedCustomer1)
                .build();
        order1.getProducts().add(savedProduct1);

        Order order2 = Order.builder()
                .customer(savedCustomer1)
                .build();
        order1.getProducts().add(savedProduct2);

        Order order3 = Order.builder()
                .customer(savedCustomer2)
                .build();
        order1.getProducts().add(savedProduct2);

        orderRepository.saveAll(Arrays.asList(order1, order2, order3));


    }
}
