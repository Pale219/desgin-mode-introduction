package factory.factoryMethod.pizza;

public class BJCheesePizza extends Pizza {
    public BJCheesePizza(){
        this.setName("北京奶酪披萨");
    }
    @Override
    public void prepare() {
        System.out.println("制作北京奶酪披萨,准备原材料");
    }
}
