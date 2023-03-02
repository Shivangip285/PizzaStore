package com.example.PizzaStore;

public class PizzaDecoratorBuilder {
    public PizzaReceipe pizzaReceipe=new FarmHousePizza();
    public PizzaDecoratorBuilder cheese_topping(){
        pizzaReceipe=new CheeseTopping(pizzaReceipe);
        return this;
    }
    public PizzaDecoratorBuilder cheese_burst_dough(){
        pizzaReceipe=new CheeseBurstDough(pizzaReceipe);
        return this;
    }
    public PizzaReceipe build() {
        PizzaReceipe pizzaReceipe1 = pizzaReceipe;

        // Reset the builder so it can be reused
        pizzaReceipe= new FarmHousePizza();

        return pizzaReceipe1;
    }
}
