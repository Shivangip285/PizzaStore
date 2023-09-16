package com.example.PizzaStore.Pizza.BasicPizza;

import com.example.PizzaStore.Pizza.Decorator.PizzaReceipe;

public class RegularPizza extends PizzaReceipe {
    @Override
    protected String box() {
        return "box";
    }

    @Override
    protected String cut() {
        return "pieces";
    }

    @Override
    protected String bake() {
        return "bake";
    }

    @Override
    protected String addTopping() {
        return "topping";
    }

    @Override
    protected String prepareDough() {
        return "dough";
    }
}
