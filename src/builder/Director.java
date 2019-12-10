package builder;

public class Director {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House create(){
        houseBuilder.buildBasic();
        houseBuilder.buildRoof();
        houseBuilder.buildWalls();
        return houseBuilder.build();
    }
}
