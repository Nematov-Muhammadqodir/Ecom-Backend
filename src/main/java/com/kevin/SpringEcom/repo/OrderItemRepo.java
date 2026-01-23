package com.kevin.SpringEcom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kevin.SpringEcom.model.OrderItem;

public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {
    // Optional<OrderItem> findByOrderId(String orderId);
}
