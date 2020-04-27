package com.kata.pizzafactory;

import java.util.List;

public class Factory {
    public static Pizza prepare(String pizzaType, String size, List<String> toppings, double price) {
        return Pizza.builder()
                .size(size)
                .toppings(toppings)
                .type(pizzaType)
                .price(price)
                .build();
    }
}
