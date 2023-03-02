package com.example.PizzaStore;

public abstract class PizzaReceipe {
    public void makePizza(){
        prepareDough();
        addTopping();
        bake();
        cut();
        box();
    }
    protected abstract void box();

    protected abstract void cut();

    protected abstract void bake();

    protected abstract void addTopping();

    protected abstract void prepareDough();

}
