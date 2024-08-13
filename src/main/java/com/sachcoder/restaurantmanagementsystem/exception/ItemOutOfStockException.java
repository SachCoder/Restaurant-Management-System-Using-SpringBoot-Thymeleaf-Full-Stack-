package com.sachcoder.restaurantmanagementsystem.exception;

public class ItemOutOfStockException extends RuntimeException{
    public ItemOutOfStockException(String message) {
        super(message);
    }
}
