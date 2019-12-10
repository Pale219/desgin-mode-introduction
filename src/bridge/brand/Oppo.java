package bridge.brand;

public class Oppo implements Brand {
    @Override
    public void open() {
        System.out.println("oppo手机开机");
    }

    @Override
    public void call() {
        System.out.println("oppo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("oppo手机关机");
    }
}
