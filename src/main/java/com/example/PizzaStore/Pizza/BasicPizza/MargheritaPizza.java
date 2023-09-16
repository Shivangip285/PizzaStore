package com.example.PizzaStore.Pizza.BasicPizza;

public class MargheritaPizza extends RegularPizza {
    @Override
    protected String box() {
        return "pack MargheritaPizza into box";
    }

    @Override
    protected String cut() {
        return "cut MargheritaPizza into standard pieces";
    }

    @Override
    protected String bake() {
        return "bake MargheritaPizza";
    }

    @Override
    protected String addTopping() {
        return "topping for MargheritaPizza";
    }

    @Override
    protected String prepareDough() {
        return "dough for MargheritaPizza";
    }
}
