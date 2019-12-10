package factory.abstractFactory.store;

import factory.abstractFactory.bean.Keyboard;
import factory.abstractFactory.bean.Mouse;
import factory.abstractFactory.factory.AbsFactory;
import factory.abstractFactory.factory.HpFactory;

import java.util.Calendar;

public class computerStore {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        AbsFactory factory = new HpFactory();
        Mouse mouse = factory.createMouse();
        Keyboard keyboard = factory.createKeyboard();
        mouse.brand();
        keyboard.board();
    }
}
