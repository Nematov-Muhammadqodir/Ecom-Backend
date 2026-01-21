package com.kevin.SpringEcom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevin.SpringEcom.model.Product;
import com.kevin.SpringEcom.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> allProducts() {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(int productId) {
        Optional<Product> product = productRepo.findById(productId);
        return product;
    }
}
