package decorator.decorator;

import decorator.coffee.Drink;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        super.setPrice(10);
        super.setDescription("milk");
    }
}
