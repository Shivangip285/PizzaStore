package com.example.PizzaStore;

public class ThinCrustDough extends PizzaReceipe{
    PizzaReceipe pizzaReceipe;
    public ThinCrustDough(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    protected void box() {
        pizzaReceipe.box();
    }

    @Override
    protected void cut() {
        pizzaReceipe.cut();
    }

    @Override
    protected void bake() {
        pizzaReceipe.bake();
    }
    @Override
    protected void addTopping() {
        pizzaReceipe.addTopping();
    }
    @Override
    protected void prepareDough() {
        System.out.println("prepare dough for thin crust pizza");
    }
}
