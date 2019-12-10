package singleton.type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }

}

/**02 饿汉式(静态代码块)
 * 优缺点：
 *  同01
 */
class Singleton{
    private static Singleton instance;

    private Singleton(){}

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}