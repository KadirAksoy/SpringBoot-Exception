package com.kadiraksoy.SpringBootException.exception;

public class TechnicalException extends RuntimeException {
    public TechnicalException(String message) {
        super(message);
    }
}
