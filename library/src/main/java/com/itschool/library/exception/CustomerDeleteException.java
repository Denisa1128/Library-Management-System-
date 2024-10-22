package com.itschool.library.exception;

public class CustomerDeleteException extends RuntimeException{
    public CustomerDeleteException (String message) {
        super(message);
    }
}
