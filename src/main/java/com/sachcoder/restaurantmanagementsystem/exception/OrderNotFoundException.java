package com.sachcoder.restaurantmanagementsystem.exception;

public class OrderNotFoundException extends NotFoundException{
    public OrderNotFoundException(String message) {
        super(message);
    }
}
