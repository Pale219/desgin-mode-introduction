package factory.abstractFactory.factory;

import factory.abstractFactory.bean.DellKeyboard;
import factory.abstractFactory.bean.DellMouse;
import factory.abstractFactory.bean.Keyboard;
import factory.abstractFactory.bean.Mouse;

public class DellFactory implements AbsFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
