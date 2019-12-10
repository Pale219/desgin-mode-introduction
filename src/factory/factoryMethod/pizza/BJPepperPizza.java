package factory.factoryMethod.pizza;

public class BJPepperPizza extends Pizza {
    public BJPepperPizza() {
        this.setName("北京胡椒披萨");
    }

    @Override
    public void prepare() {
        System.out.println("制作北京胡椒披萨,准备原材料");
    }
}
