package builder;

public class CommonHouseBuilder extends HouseBuilder{
    private House house;

    public CommonHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasic() {
        house.setBasic("普通楼房基础");
    }

    @Override
    public void buildWalls() {
        house.setWall("普通楼房墙壁");
    }

    @Override
    public void buildRoof() {
        house.setRoof("普通楼房楼顶");
    }

    @Override
    public House build() {
        return house;
    }
}
