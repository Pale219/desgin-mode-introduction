package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.LDCheesePizza;
import factory.factoryMethod.pizza.LDPepperPizza;
import factory.factoryMethod.pizza.Pizza;

public class LDPizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza(String type) {
        switch(type){
            case "cheese":
                return new LDCheesePizza();
            case "pepper":
                return new LDPepperPizza();
            default:
                return null;
        }
    }
}
