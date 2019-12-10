package factory.simpleFactory.pizza;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        this.setName("奶酪披萨");
    }
    @Override
    public void prepare() {
        System.out.println("制作奶酪披萨,准备原材料");
    }
}
