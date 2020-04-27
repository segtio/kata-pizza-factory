package com.kata.pizzafactory;

import com.kata.pizzafactory.exception.InvalidRecipe;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FactoryTest {

    @Test
    public void should_prepare_small_mexican_pizza () {
        // GIVEN
        String pizzaType = "Mexican";
        String size = "Small";
        double price = 11.0;

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
        Pizza pizza = Factory.prepare(pizzaType, size, toppings, price);
        // THEN
        assertThat(pizza.getType()).isEqualTo(pizzaType);
        assertThat(pizza.getSize()).isEqualTo(size);
        assertThat(pizza.getToppings()).isEqualTo(toppings);
        assertThat(pizza.getPrice()).isEqualTo(price);
    }

    @Test
    public void should_prepare_small_4seasons_pizza () {

        // GIVEN
        String pizzaType = "Mexican";
        String size = "Small";
        double price = 11.0;

        List<String> toppings = new ArrayList<String>(){{
            add("tomato sauce");
            add("egg");
            add("spinach");
            add("pepper");
            add("cheese");
            add("chedday");
            add("balsamic vinegar");
        }};
        // WHEN
        Pizza pizza = Factory.prepare(pizzaType, size, toppings, price);
        // THEN
        assertThat(pizza.getType()).isEqualTo(pizzaType);
        assertThat(pizza.getSize()).isEqualTo(size);
        assertThat(pizza.getToppings()).isEqualTo(toppings);
        assertThat(pizza.getPrice()).isEqualTo(price);
    }

    @Test(expected = InvalidRecipe.class)
    public void should_throws_error_when_no_minimum_1_toppings () {
        // GIVEN
        String pizzaType = "Mexican";
        String size = "Small";
        double price = 11.0;

        List<String> toppings = new ArrayList<String>();
        // WHEN
      Factory.prepare(pizzaType, size, toppings, price);
    }
}
