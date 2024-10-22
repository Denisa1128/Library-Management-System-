package com.itschool.library.exception;

public class CustomerDuplicateEmailException extends RuntimeException {

    public CustomerDuplicateEmailException(String message) {
        super(message);
    }
}