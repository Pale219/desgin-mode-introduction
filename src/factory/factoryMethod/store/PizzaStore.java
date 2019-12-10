package factory.factoryMethod.store;

import factory.factoryMethod.factory.BJPizzaFactory;
import factory.factoryMethod.factory.PizzaFactory;
import factory.factoryMethod.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory factory = new BJPizzaFactory();
        Pizza pizza = factory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
