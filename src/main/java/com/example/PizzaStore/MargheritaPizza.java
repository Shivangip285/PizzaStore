package com.example.PizzaStore;

public class MargheritaPizza extends RegularPizza{
    @Override
    protected void box() {
        System.out.println("box for MargheritaPizza");
    }

    @Override
    protected void cut() {
        System.out.println("pieces of MargheritaPizza");
    }

    @Override
    protected void bake() {
        System.out.println("bake MargheritaPizza");
    }

    @Override
    protected void addTopping() {
        System.out.println("topping for MargheritaPizza");
    }

    @Override
    protected void prepareDough() {
        System.out.println("dough for MargheritaPizza");
    }
}
