package com.example.PizzaStore;

import com.example.PizzaStore.Pizza.BasicPizza.MargheritaPizza;
import com.example.PizzaStore.Pizza.Decorator.CheeseBurstDough;
import com.example.PizzaStore.Pizza.Decorator.CheeseTopping;
import com.example.PizzaStore.Pizza.Decorator.PizzaReceipe;
import com.example.PizzaStore.Pizza.PizzaDecoratorBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PizzaStoreApplicationTests {

	@Test
	void shouldReturnCheeseBurstFarmHousePizza() {
		PizzaReceipe farmHousePizzaReceipe=new PizzaDecoratorBuilder().cheese_topping().cheese_burst_dough().build();

		assertThat(farmHousePizzaReceipe.makePizza().get(0)).isEqualTo("prepare dough for cheese burst pizza");
		assertThat(farmHousePizzaReceipe.makePizza().get(1)).isEqualTo("add cheese topping to pizza");
		assertThat(farmHousePizzaReceipe.makePizza().get(2)).isEqualTo("bake FarmHousePizza");
		assertThat(farmHousePizzaReceipe.makePizza().get(3)).isEqualTo("cut FarmHousePizza into standard pieces");
		assertThat(farmHousePizzaReceipe.makePizza().get(4)).isEqualTo("pack FarmHousePizza into box");
	}
	@Test
	void shouldReturnCheeseBurstMargheritaPizza() {
		PizzaReceipe margheritaPizzaReceipe=new MargheritaPizza();

		margheritaPizzaReceipe = new CheeseTopping(new CheeseBurstDough(margheritaPizzaReceipe));

		assertThat(margheritaPizzaReceipe.makePizza().get(0)).isEqualTo("prepare dough for cheese burst pizza");
		assertThat(margheritaPizzaReceipe.makePizza().get(1)).isEqualTo("add cheese topping to pizza");
		assertThat(margheritaPizzaReceipe.makePizza().get(2)).isEqualTo("bake MargheritaPizza");
		assertThat(margheritaPizzaReceipe.makePizza().get(3)).isEqualTo("cut MargheritaPizza into standard pieces");
		assertThat(margheritaPizzaReceipe.makePizza().get(4)).isEqualTo("pack MargheritaPizza into box");
	}
}
