package com.sachcoder.restaurantmanagementsystem.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
