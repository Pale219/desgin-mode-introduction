package singleton.type4;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


/**饿汉式(线程安全)
 *  达到了lazyLoading的效果，解决了线程安全问题
 *  整个方法进行同步，效率太低
 *
 *  不推荐使用
 */
class Singleton{
    private static Singleton instance;
    private Singleton(){}

    //加入同步处理代码，解决线程安全问题
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
