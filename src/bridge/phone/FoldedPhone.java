package bridge.phone;

import bridge.brand.Brand;

/**
 *
 * 充当了桥，调用了接口实现的方法
 */
public class FoldedPhone extends Phone{

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠式");
    }

    public void call(){
        super.call();
        System.out.println("折叠式");
    }

    public void close(){
        super.close();
        System.out.println("折叠式");
    }
}
