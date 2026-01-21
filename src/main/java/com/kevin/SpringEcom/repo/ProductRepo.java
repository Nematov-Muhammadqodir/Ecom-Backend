package com.kevin.SpringEcom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kevin.SpringEcom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
