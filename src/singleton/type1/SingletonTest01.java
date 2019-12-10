package singleton.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleTon = Singleton.getInstance();
        System.out.println(singleTon.hashCode());
    }

}

/**01 饿汉式(静态常量)
 * 优缺点：
 * 优点：
 *  写法简单，在类装载的时候实例化，避免多线程问题
 * 缺点：
 *  在类装载的时候实例化，没有达到lazy loading的效果，如果从始至终没使用过这个实例的话，会造成内存的浪费
 */
class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}