package com.kevin.SpringEcom.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.kevin.SpringEcom.model.Product;
import com.kevin.SpringEcom.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> allProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(int productId) {
        Product product = productRepo.findById(productId).get();
        return product;
    }

    public Product addOrUpdateProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return productRepo.save(product);
    }

    public void deleteProductById(int productId) {
        productRepo.deleteById(productId);
    }

    public List<Product> searchByKeyword(String keyword) {
        return productRepo.searchByKeyword(keyword);
    }
}
