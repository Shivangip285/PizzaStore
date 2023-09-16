package com.example.PizzaStore.Pizza.Decorator;

public class EightPieceCut extends PizzaReceipe {
    PizzaReceipe pizzaReceipe;

    public EightPieceCut(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    public String box() {
        return pizzaReceipe.box();
    }

    @Override
    public String cut() {
        return "Cut Pizza into eight pieces";
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
        return pizzaReceipe.prepareDough();
    }
}
