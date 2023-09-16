package com.example.PizzaStore.Pizza.Decorator;

public class CheeseTopping extends PizzaReceipe {

    PizzaReceipe pizzaReceipe;

    public CheeseTopping(PizzaReceipe pizzaReceipe) {
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
    protected String prepareDough() {
        return pizzaReceipe.prepareDough();
    }

    @Override
    protected String addTopping() {
        return "add cheese topping to pizza";
    }


}
