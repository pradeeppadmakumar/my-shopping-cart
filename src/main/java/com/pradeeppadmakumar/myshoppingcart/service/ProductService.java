package com.pradeeppadmakumar.myshoppingcart.service;

import com.pradeeppadmakumar.myshoppingcart.dto.ProductDTO;

import java.util.List;
import java.util.UUID;

public interface ProductService {

    public List<ProductDTO> getAllProducts();

    public ProductDTO getProductById(UUID productId);

    public ProductDTO createProduct(ProductDTO productDTO);

    public ProductDTO updateProduct(UUID productId, ProductDTO productDTO);

    public Boolean deleteProduct(UUID productId);
}
