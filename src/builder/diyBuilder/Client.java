package builder.diyBuilder;

public class Client {
    public static void main(String[] args) {
        DiyBuilder builder = new DiyBuilder();
        House house =builder.buildBasic("diyBasic").buildRoof("diyRoof").buildWall("diyWall").build();
        System.out.println(house);
    }
}
