package adapter.adapter2;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        int dst = src/44;
        System.out.println("转换电压为"+dst+"伏");
        return dst;
    }
}
