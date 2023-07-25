package com.pradeeppadmakumar.myshoppingcart.mapper;

import com.pradeeppadmakumar.myshoppingcart.dto.CustomerDTO;
import com.pradeeppadmakumar.myshoppingcart.dto.OrderDTO;
import com.pradeeppadmakumar.myshoppingcart.dto.ProductDTO;
import com.pradeeppadmakumar.myshoppingcart.entity.Customer;
import com.pradeeppadmakumar.myshoppingcart.entity.Order;
import com.pradeeppadmakumar.myshoppingcart.entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ShoppingMapper {

    public OrderDTO orderToOrderDTO(Order order);

    public Order orderDtoToOrder(OrderDTO orderDTO);

    public List<OrderDTO> orderListToOrderDtoList(List<Order> orderList);


    public CustomerDTO customerToCustomerDTO(Customer customer);

    public Customer customerDtoToCustomer(CustomerDTO customerDTO);

    public List<CustomerDTO> customerListToCustomerDtoList(List<Customer> customerList);


    public ProductDTO productToProductDTO(Product product);

    public Product productDtoToProduct(ProductDTO productDTO);

    public List<ProductDTO> productListToProductDtoList(List<Product> productList);
}
