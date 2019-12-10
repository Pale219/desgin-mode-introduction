package builder;

import com.sun.org.apache.xpath.internal.operations.String;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.setHouseBuilder(new CommonHouseBuilder());
        House house = director.create();
        System.out.println(house);

    }
}
