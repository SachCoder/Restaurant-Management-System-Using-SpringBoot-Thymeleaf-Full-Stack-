package com.sachcoder.restaurantmanagementsystem.exception;

public class TableConflictException extends ConflictException{
    public TableConflictException(String message) {
        super(message);
    }
}
