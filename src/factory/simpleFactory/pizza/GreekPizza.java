package factory.simpleFactory.pizza;

public class GreekPizza extends Pizza{
    public GreekPizza() {
        this.setName("希腊披萨");
    }

    @Override
    public void prepare() {
        System.out.println("制作希腊披萨,准备原材料");
    }
}
