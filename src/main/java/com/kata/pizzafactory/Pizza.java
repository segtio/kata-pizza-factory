package com.kata.pizzafactory;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza {
    private String type;
    private String size;
    private List<String> toppings;
}
