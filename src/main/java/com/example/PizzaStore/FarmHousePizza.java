package com.example.PizzaStore;

public class FarmHousePizza extends RegularPizza{
    @Override
    protected void box() {
        System.out.println("box for FarmHousePizza");
    }

    @Override
    protected void cut() {
        System.out.println("pieces of FarmHousePizza");
    }

    @Override
    protected void bake() {
        System.out.println("bake FarmHousePizza");
    }

    @Override
    protected void addTopping() {
        System.out.println("topping for FarmHousePizza");
    }

    @Override
    protected void prepareDough() {
        System.out.println("dough for FarmHousePizza");
    }
}
