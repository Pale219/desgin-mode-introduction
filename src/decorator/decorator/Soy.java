package decorator.decorator;

import decorator.coffee.Drink;

public class Soy extends Decorator{
    public Soy(Drink drink) {
        super(drink);
        super.setPrice(15);
        super.setDescription("soy");
    }
}
