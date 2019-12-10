package bridge.phone;

import bridge.brand.Brand;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public void call(){
        brand.call();
    }

    public void open(){
        brand.open();
    }

    public void close(){
        brand.close();
    }
}
