package adapter.adapter2;

public class Phone {
    public void charge(IVoltage5V iVoltage5V){
        iVoltage5V.output5V();
    }
}
