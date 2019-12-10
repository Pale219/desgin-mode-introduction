package builder.diyBuilder;

public abstract class Builder {
    public abstract Builder buildBasic(String basic);
    public abstract Builder buildWall(String wall);
    public abstract Builder buildRoof(String roof);
    public abstract House build();
}
