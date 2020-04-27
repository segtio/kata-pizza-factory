package com.kata.pizzafactory.enumeration;

import lombok.Getter;

public enum PizzaSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    @Getter
    private String value;

    PizzaSize(String value) {
        this.value = value;
    }
}
