package com.example.PizzaStore.Pizza.Decorator;

public class ThinCrustDough extends PizzaReceipe {
    PizzaReceipe pizzaReceipe;
    public ThinCrustDough(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    protected String box() {
        return pizzaReceipe.box();
    }

    @Override
    protected String cut() {
        return pizzaReceipe.cut();
    }

    @Override
    protected String bake() {
        return pizzaReceipe.bake();
    }
    @Override
    protected String addTopping() {
        return pizzaReceipe.addTopping();
    }
    @Override
    protected String prepareDough() {
        return "prepare dough for thin crust pizza";
    }
}
