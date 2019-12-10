package builder;

public abstract class HouseBuilder {
    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void buildRoof();

    public abstract House build();
}
