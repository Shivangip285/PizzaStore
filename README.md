## Pizza-Store

This application depict a pizza store to with steps to prepare variety of pizza using decorator, template design pattern.
The steps to prepare basic pizza is defined in `PizzaRecipe` using template pattern and include preparing dough, adding
topping, baking, cutting and packing in box. This class is extended to `FarmHousePizza` and `MargeheritaPizza` to prepare
basic pizza of respective type.
   The classes in Decorator package other than PizzaRecipe are the decorator or wrapper for basic pizza. The CheeseBurstDough
class implements the `prepareDough` method and return `prepare dough for cheese burst pizza`, likewise different decorator are
implementing the specific method in a way to form desired wrapper
   The test `shouldReturnCheeseBurstMargheritaPizza` initialises MargheritaPizza and later wrap it in CheeseTopping and
CheeseBurstDough, resulting in `makePizza` to have `prepare dough for cheese burst pizza` as 1st list string from `prepareDough`
method and `add cheese topping to pizza` as 2nd list string from `addTopping` method.

## Running the app

`./gradlew bootRun `

## Contributing to the codebase

Please adhere to the following guidelines while contributing to this codebase

### Running tests and other gradle tasks

`./gradlew test`

