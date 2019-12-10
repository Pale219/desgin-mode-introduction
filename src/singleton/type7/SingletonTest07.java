package singleton.type7;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        instance.sayHello();
    }
}


/**
 * 通过枚举类来实现单例模式
 *  不仅能避免多线程问题，还能防止反序列化重新创建新的对象
 *  推荐使用
 *
 */
enum Singleton{
    INSTANCE;

    public void sayHello(){
        System.out.println("hello");
    }
}





