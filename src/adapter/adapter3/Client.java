package adapter.adapter3;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Adapter5V());
    }
}
