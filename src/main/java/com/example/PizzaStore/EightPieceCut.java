package com.example.PizzaStore;

public class EightPieceCut extends PizzaReceipe {
    PizzaReceipe pizzaReceipe;

    public EightPieceCut(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    public void box() {
        pizzaReceipe.box();
    }

    @Override
    public void cut() {
        System.out.println("Cut Pizza into eight pieces");
    }

    @Override
    public void bake() {
        pizzaReceipe.bake();
    }

    @Override
    public void addTopping() {
        pizzaReceipe.addTopping();
    }

    @Override
    public void prepareDough() {
        pizzaReceipe.prepareDough();
    }
}
