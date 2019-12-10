package factory.simpleFactory;

import factory.simpleFactory.pizza.Pizza;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("greek");
    }


    public void orderPizza(String type){
        PizzaFactory pizzaFactory = PizzaFactory.getInstance();
        Pizza pizza = pizzaFactory.makePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }
}
