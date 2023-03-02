package com.example.PizzaStore;

public class CheeseTopping extends PizzaReceipe{

    PizzaReceipe pizzaReceipe;

    public CheeseTopping(PizzaReceipe pizzaReceipe) {
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
    protected void prepareDough() {
        System.out.println("prepare dough for cheese burst pizza");
    }

    @Override
    protected void addTopping() {
        System.out.println("add cheese topping to pizza");
    }


}
