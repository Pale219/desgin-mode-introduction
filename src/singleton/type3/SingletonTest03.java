package singleton.type3;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


/**饿汉式(线程不安全)
 *  达到了lazyLoading的效果，但是线程不安全，只能在单线程下使用
 *
 *  尽量不要使用
 */
class Singleton{
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
