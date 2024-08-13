package com.sachcoder.restaurantmanagementsystem.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

import com.sachcoder.restaurantmanagementsystem.data.entity.RestaurantTable;

@Data
public class OrderDTO {
    private List<OrderItemDTO> items;
    private double totalPrice;
    private RestaurantTable table;
    private Date orderDate;
}
