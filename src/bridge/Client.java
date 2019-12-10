package bridge;

import bridge.brand.Huawei;
import bridge.brand.Oppo;
import bridge.phone.FoldedPhone;
import bridge.phone.Phone;
import bridge.phone.UpRightPhone;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Huawei());
        phone.call();
        phone.open();
        phone.close();

        Phone phone1 = new UpRightPhone(new Oppo());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
