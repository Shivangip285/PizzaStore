package com.example.PizzaStore;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PizzaStoreApplicationTests {

	@Test
	void shouldGetCheeseBurstFarmHousePizza() {
		PizzaReceipe farmHousePizzaReceipe=new PizzaDecoratorBuilder().cheese_topping().cheese_burst_dough().build();
		farmHousePizzaReceipe.makePizza();
//        farmHousePizzaReceipe = new CheeseTopping(new CheeseBurstDough(farmHousePizzaReceipe));
//        farmHousePizzaReceipe.makePizza();
	}
	@Test
	void shouldGetCheeseBurstMargheritaPizzas() {
		PizzaReceipe margheritaPizzaReceipe=new MargheritaPizza();

		margheritaPizzaReceipe = new CheeseTopping(new CheeseBurstDough(margheritaPizzaReceipe));
		margheritaPizzaReceipe.makePizza();
	}
}
