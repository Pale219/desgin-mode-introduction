package decorator.decorator;

import decorator.coffee.Drink;

public abstract class Decorator extends Drink {
    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    public int cost(){
        return super.getPrice() + drink.cost();
    }

    public String description(){
        return super.getDescription() + " " + drink.description();
    }
}
