package factory.abstractFactory.factory;

import factory.abstractFactory.bean.HpKeyboard;
import factory.abstractFactory.bean.HpMouse;
import factory.abstractFactory.bean.Keyboard;
import factory.abstractFactory.bean.Mouse;

public class HpFactory implements AbsFactory{
    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
