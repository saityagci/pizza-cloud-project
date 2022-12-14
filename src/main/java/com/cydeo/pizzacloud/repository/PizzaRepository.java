package com.cydeo.pizzacloud.repository;

import com.cydeo.pizzacloud.model.Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaRepository {

    private static List<Pizza> pizzaList = new ArrayList<>();

    public Pizza createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
        return pizzaToSave;
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

}
