package com.pradeeppadmakumar.myshoppingcart.controller;

import com.pradeeppadmakumar.myshoppingcart.dto.ProductDTO;
import com.pradeeppadmakumar.myshoppingcart.service.ProductService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{productId}")
    public ProductDTO getProductById(@PathVariable UUID productId) {
        return productService.getProductById(productId);
    }

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @PutMapping("/{productId}")
    public ProductDTO updateProduct(@PathVariable UUID productId, @RequestBody ProductDTO productDTO) {
        return productService.updateProduct(productId, productDTO);
    }

    @DeleteMapping("/{productId}")
    public Boolean deleteProduct(@PathVariable UUID productId) {
        return productService.deleteProduct(productId);
    }
}
