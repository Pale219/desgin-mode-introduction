package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.BJCheesePizza;
import factory.factoryMethod.pizza.BJPepperPizza;
import factory.factoryMethod.pizza.Pizza;

public class BJPizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        switch(type){
            case "cheese":
                return new BJCheesePizza();
            case "pepper":
                return new BJPepperPizza();
            default:
                return null;
        }
    }
}
