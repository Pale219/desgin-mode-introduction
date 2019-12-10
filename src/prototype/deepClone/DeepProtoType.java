package prototype.deepClone;

import java.io.*;

public class DeepProtoType implements Serializable,Cloneable {
    private String name;
    private DeepCloneTarget deepCloneTarget;

    public DeepProtoType() {
    }

    public DeepProtoType(String name, DeepCloneTarget deepCloneTarget) {
        this.name = name;
        this.deepCloneTarget = deepCloneTarget;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTarget getDeepCloneTarget() {
        return deepCloneTarget;
    }

    public void setDeepCloneTarget(DeepCloneTarget deepCloneTarget) {
        this.deepCloneTarget = deepCloneTarget;
    }


    //深度复制方法1，重写cloneable接口
    @Override
    protected Object clone(){
        DeepProtoType newDeepProtoType = null;
        try {
            newDeepProtoType = (DeepProtoType) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        newDeepProtoType.deepCloneTarget = (DeepCloneTarget)this.deepCloneTarget.clone();
        return newDeepProtoType;
    }


    //深度复制方法2，序列化后反序列化
    public DeepProtoType deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);

            DeepProtoType newDeepProtoType = (DeepProtoType) ois.readObject();

            return newDeepProtoType;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
