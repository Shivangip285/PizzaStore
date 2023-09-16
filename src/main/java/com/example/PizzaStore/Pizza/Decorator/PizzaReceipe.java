package com.example.PizzaStore.Pizza.Decorator;

import java.util.List;

public abstract class PizzaReceipe {
    public List<String> makePizza(){
        return List.of(
        prepareDough(),
        addTopping(),
        bake(),
        cut(),
        box());
    }
    protected abstract String box();

    protected abstract String cut();

    protected abstract String bake();

    protected abstract String addTopping();

    protected abstract String prepareDough();

}
