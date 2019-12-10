package singleton.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


/**双重检查(推荐)
 * lazy loading
 * 线程安全
 * 保证效率
 *
 */
class Singleton{
    private static volatile Singleton instance; //volatile关键字，将更新后的数据立即刷新到内存
    private Singleton(){}

    public static Singleton getInstance(){
        //双重检查
        if(instance == null){
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
