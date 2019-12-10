package builder;

public class HighBuildingBuilder extends HouseBuilder{
    private House house = new House();
    @Override
    public void buildBasic() {
        house.setBasic("高楼基础");
    }

    @Override
    public void buildWalls() {
        house.setWall("高楼墙壁");
    }

    @Override
    public void buildRoof() {
        house.setRoof("高楼楼顶");
    }

    @Override
    public House build() {
        return house;
    }
}
