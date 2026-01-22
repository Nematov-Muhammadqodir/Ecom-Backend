package com.kevin.SpringEcom.model.dto;

import java.time.LocalDate;
import java.util.List;

import com.kevin.SpringEcom.utils.enums.OrderStatus;

public record OrderResponse(String orderId, String customerName, String email, OrderStatus status, LocalDate orderDate,
                List<OrderItemResponse> items) {
}
