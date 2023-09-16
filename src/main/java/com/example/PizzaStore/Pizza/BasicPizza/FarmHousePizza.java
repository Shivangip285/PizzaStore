package com.example.PizzaStore.Pizza.BasicPizza;

public class FarmHousePizza extends RegularPizza {
    @Override
    protected String box() {
        return "pack FarmHousePizza into box";
    }

    @Override
    protected String cut() {
        return "cut FarmHousePizza into standard pieces";
    }

    @Override
    protected String bake() {
        return "bake FarmHousePizza";
    }

    @Override
    protected String addTopping() {
        return "topping for FarmHousePizza";
    }

    @Override
    protected String prepareDough() {
        return "dough for FarmHousePizza";
    }
}
