package com.kata.pizzafactory;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Pizza {
    private String type;
    private String size;
    private List<String> toppings;
    private double price;
}
