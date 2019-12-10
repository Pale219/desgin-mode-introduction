package factory.factoryMethod.pizza;

public class LDCheesePizza extends Pizza {
    public LDCheesePizza(){
        this.setName("伦敦奶酪披萨");
    }
    @Override
    public void prepare() {
        System.out.println("制作伦敦奶酪披萨,准备原材料");
    }
}
