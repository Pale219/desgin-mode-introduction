package factory.abstractFactory.factory;

import factory.abstractFactory.bean.Keyboard;
import factory.abstractFactory.bean.Mouse;

public interface AbsFactory {
    Mouse createMouse();
    Keyboard createKeyboard();
}
