package com.kata.pizzafactory;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    @Test
    public void should_print_prepare_small_mexican_pizza () {
        // GIVEN
        String pizzaType = "Mexican";
        String size = "Small";

        List<String> toppings = new ArrayList<String>(){{
            add("meats");
            add("pepperoni");
            add("ananas");
            add("pepper");
            add("cheese");
            add("chedday");
            add("hot sauce");
            add("tomato sauce");
        }};
        // WHEN
        Pizza pizza = Factory.prepare(pizzaType, size, toppings);
        // THEN
        assertThat(pizza.getType()).isEqualTo(pizzaType);
        assertThat(pizza.getSize()).isEqualTo(size);
        assertThat(pizza.getToppings()).isEqualTo(toppings);
    }
}
