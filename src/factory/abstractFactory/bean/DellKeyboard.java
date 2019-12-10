package factory.abstractFactory.bean;

public class DellKeyboard implements Keyboard {
    @Override
    public void board() {
        System.out.println("dell keyboard");
    }
}
