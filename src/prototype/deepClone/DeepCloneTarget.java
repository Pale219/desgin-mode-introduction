package prototype.deepClone;

import java.io.Serializable;

public class DeepCloneTarget implements Cloneable, Serializable {
    private String name;
    private int age;

    public DeepCloneTarget() {
    }

    public DeepCloneTarget(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() {
        DeepCloneTarget newDeepCloneTarget = null;
        try {
            newDeepCloneTarget = (DeepCloneTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return newDeepCloneTarget;
    }
}
