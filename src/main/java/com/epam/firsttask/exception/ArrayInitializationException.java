package com.epam.firsttask.exception;

public class ArrayInitializationException extends Exception {
    public ArrayInitializationException() {
    }

    public ArrayInitializationException(String message) {
        super(message);
    }

    public ArrayInitializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayInitializationException(Throwable cause) {
        super(cause);
    }
}
