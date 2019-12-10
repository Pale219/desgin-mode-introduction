package adapter.adapter1;

public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        int src = this.output220V();
        int dst = src/44;
        System.out.println("转换电压为"+dst+"伏");
        return dst;
    }
}
