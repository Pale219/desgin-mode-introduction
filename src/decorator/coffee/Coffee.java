package decorator.coffee;

public abstract class Coffee extends Drink{
    @Override
    public int cost() {
        return super.getPrice();
    }

    @Override
    public String description() {
        return super.getDescription();
    }
}
