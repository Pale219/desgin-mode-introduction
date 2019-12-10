package adapter.adapter3;

public class Adapter5V extends AbstractVoltageAdapter{
    Voltage220V voltage220V = new Voltage220V();

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src/44;
        System.out.println("转换电压为"+dst+"伏");
        return dst;
    }
}
