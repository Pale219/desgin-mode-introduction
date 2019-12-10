package singleton.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


/**静态内部类(推荐使用)
 *  这种方式采用了类装载机制来保证初始化实例时只有一个线程
 *  静态内部类方式在Singleton类装载时不会立即被实例化，而是在需要实例化的时，调用getInstance方法，才会装载SingleInstace类，从而完成instanced的实例化
 *  类的静态属性只会在第一次加载类的时候初始化，所以在这里，jvm帮助我们保证了线程的安全性，在类的初始化时，别的线程是无法进入的。
 *  优点同二次加载
 *
 *  缺点：无法传参
 *
 */
class Singleton{
    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
