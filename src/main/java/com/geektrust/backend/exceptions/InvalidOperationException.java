package com.geektrust.backend.exceptions;

public class InvalidOperationException extends RuntimeException{
    public InvalidOperationException() {
        super();
    }

    public InvalidOperationException(String message) {
        super(message);
    }
}
