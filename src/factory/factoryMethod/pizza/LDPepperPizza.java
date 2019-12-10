package factory.factoryMethod.pizza;

public class LDPepperPizza extends Pizza {
    public LDPepperPizza() {
        this.setName("伦敦胡椒披萨");
    }

    @Override
    public void prepare() {
        System.out.println("制作伦敦胡椒披萨,准备原材料");
    }
}
