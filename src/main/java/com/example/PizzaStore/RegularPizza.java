package com.example.PizzaStore;

public class RegularPizza extends PizzaReceipe{
    @Override
    protected void box() {
        System.out.println("box");
    }

    @Override
    protected void cut() {
        System.out.println("pieces");
    }

    @Override
    protected void bake() {
        System.out.println("bake");
    }

    @Override
    protected void addTopping() {
        System.out.println("topping");
    }

    @Override
    protected void prepareDough() {
        System.out.println("dough");
    }
}
