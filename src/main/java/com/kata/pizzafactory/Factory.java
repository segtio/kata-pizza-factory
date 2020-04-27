package com.kata.pizzafactory;

import com.kata.pizzafactory.exception.InvalidRecipe;

import java.util.List;

public class Factory {
    public static Pizza prepare(String pizzaType, String size, List<String> toppings, double price) {
        if (!checkToppings(toppings)) {
            throw new InvalidRecipe("toppings should have a least one element");
        }

        return Pizza.builder()
                .size(size)
                .toppings(toppings)
                .type(pizzaType)
                .price(price)
                .build();
    }

    static boolean checkToppings(List<String> toppings) {
        return toppings != null && toppings.size() > 0;
    }
}
