package prototype.deepClone;

public class Client {
    public static void main(String[] args) {
        DeepProtoType deepProtoType = new DeepProtoType();
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget("pale",20);
        deepProtoType.setName("zhengjun");
        deepProtoType.setDeepCloneTarget(deepCloneTarget);


        DeepProtoType deepProtoType1 = (DeepProtoType)deepProtoType.deepClone();

        System.out.println(deepProtoType.hashCode());
        System.out.println(deepProtoType1.hashCode());
        System.out.println(deepProtoType.getDeepCloneTarget().hashCode());
        System.out.println(deepProtoType1.getDeepCloneTarget().hashCode());
    }
}
