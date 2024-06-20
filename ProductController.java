package com.exercise.springexercise.controller;

import com.exercise.springexercise.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController
{
    Product product;
    @GetMapping("{productId}")
    public Product getProductDetail(@PathVariable String productId){
        return product;
    }

    @PostMapping
    public String createProduct(Product product){
        this.product = product;
        return "Product created successfully";
    }

    @PutMapping
    public  String updateProduct(Product product){
        this.product = product;
        return "Product updated successfully";
    }

    @DeleteMapping("{ productId} ")
    public String deleteProduct(String productId){
        this.product = null;
        return "Product deleted successfully";
    }

}
