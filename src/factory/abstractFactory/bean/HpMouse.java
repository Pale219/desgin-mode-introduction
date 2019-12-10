package factory.abstractFactory.bean;

public class HpMouse implements Mouse{
    @Override
    public void brand() {
        System.out.println("hp mouse");
    }
}
