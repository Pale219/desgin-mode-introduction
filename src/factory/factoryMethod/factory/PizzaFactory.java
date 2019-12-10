package factory.factoryMethod.factory;

import factory.factoryMethod.pizza.Pizza;

public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
