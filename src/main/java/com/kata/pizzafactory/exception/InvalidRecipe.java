package com.kata.pizzafactory.exception;

public class InvalidRecipe extends RuntimeException {
    public InvalidRecipe(String message) {
        super(message);
    }
}
