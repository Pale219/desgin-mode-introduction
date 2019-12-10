package adapter.adapter3;

public abstract class AbstractVoltageAdapter implements Adapter{
    @Override
    public int output5V() {
        return 9999;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output15V() {
        return 0;
    }
}
