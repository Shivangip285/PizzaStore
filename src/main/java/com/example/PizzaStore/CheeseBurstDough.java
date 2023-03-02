package com.example.PizzaStore;

public class CheeseBurstDough extends PizzaReceipe  {
    PizzaReceipe pizzaReceipe;

    public CheeseBurstDough(PizzaReceipe pizzaReceipe) {
        this.pizzaReceipe = pizzaReceipe;
    }

    @Override
    public void box() {
        pizzaReceipe.box();
    }

    @Override
    public void cut() {
       pizzaReceipe.cut();
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
        System.out.println("prepare dough for cheese burst pizza");
    }
}
