package builder.diyBuilder;

public class DiyBuilder extends Builder {
    private House house;

    public DiyBuilder() {
        this.house = new House();
    }

    @Override
    public Builder buildBasic(String basic) {
        this.house.setBasic(basic);
        return this;
    }

    @Override
    public Builder buildWall(String wall) {
        this.house.setWall(wall);
        return this;
    }

    @Override
    public Builder buildRoof(String roof) {
        this.house.setRoof(roof);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
