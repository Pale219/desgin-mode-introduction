package prototype.shallowClone;

public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String gender;
    private Sheep friend;

    public Sheep(String name, int age, String gender, Sheep friend) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.friend = friend;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", friend=" + friend +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep) super.clone();
        return sheep;
    }
}
