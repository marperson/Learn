package com.frankhe.java.ocp.lab14_multithreading.data;

public class ProductManagerException extends Exception{
    public ProductManagerException() {
    }

    public ProductManagerException(String message) {
        super(message);
    }

    public ProductManagerException(String message, Throwable cause) {
        super(message, cause);
    }

}
