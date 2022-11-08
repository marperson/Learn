package com.frankhe.java.ocp.lab15_module.data;

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
