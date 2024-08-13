package com.sachcoder.restaurantmanagementsystem.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachcoder.restaurantmanagementsystem.data.entity.Item;
import com.sachcoder.restaurantmanagementsystem.data.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByOrderDateBetween(LocalDateTime orderDate, LocalDateTime orderDate2);
    long countByOrderDateBetween(LocalDateTime orderDate, LocalDateTime orderDate2);
 
    List<Order> findOrdersByItemsContaining(Item item);
}
