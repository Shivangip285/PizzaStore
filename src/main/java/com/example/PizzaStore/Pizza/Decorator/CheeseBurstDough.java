package com.example.PizzaStore.Pizza.Decorator;

public class CheeseBurstDough extends PizzaReceipe {
    PizzaReceipe pizzaReceipe;

    public CheeseBurstDough(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    public String box() {
        return pizzaReceipe.box();
    }

    @Override
    public String cut() {
        return pizzaReceipe.cut();
    }

    @Override
    public String bake() {
        return pizzaReceipe.bake();
    }

    @Override
    public String addTopping() {
        return pizzaReceipe.addTopping();
    }

    @Override
    public String prepareDough() {
        return "prepare dough for cheese burst pizza";
    }
}
