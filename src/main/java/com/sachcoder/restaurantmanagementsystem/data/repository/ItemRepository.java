package com.sachcoder.restaurantmanagementsystem.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachcoder.restaurantmanagementsystem.data.entity.Item;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findAllByProduct_Name(String productName);
    List<Item> findAllByProduct_ProductId(long id);
}
