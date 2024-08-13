package com.sachcoder.restaurantmanagementsystem.dto;

import com.sachcoder.restaurantmanagementsystem.data.entity.Product;

import lombok.Data;

@Data
public class OrderItemDTO {
    private Product product;
    private int quantity;
}
