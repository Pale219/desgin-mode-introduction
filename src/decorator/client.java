package decorator;

import decorator.coffee.Decafe;
import decorator.coffee.Drink;
import decorator.decorator.Decorator;
import decorator.decorator.Milk;
import decorator.decorator.Soy;

public class client {
    public static void main(String[] args) {
        Drink drink = new Decafe();
        Decorator decoratorCoffee = new Milk(drink);
        decoratorCoffee = new Milk(decoratorCoffee);
        decoratorCoffee = new Soy(decoratorCoffee);
        System.out.println(decoratorCoffee.cost());
        System.out.println(decoratorCoffee.description());
    }
}
