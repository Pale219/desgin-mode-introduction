package factory.abstractFactory.bean;

public class HpKeyboard implements Keyboard {
    @Override
    public void board() {
        System.out.println("hp keyboard");
    }
}
