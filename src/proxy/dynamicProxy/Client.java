package proxy.dynamicProxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Teacher());
        ITeacher proxy = (ITeacher) proxyFactory.getProxyInstance();
        proxy.teach();
    }
}
