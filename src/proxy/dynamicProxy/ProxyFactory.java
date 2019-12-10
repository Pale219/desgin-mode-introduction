package proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object target;


    public ProxyFactory(Object target) {
        this.target = target;
    }


    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("123");
                    Object returnVal =method.invoke(target,args);
                    return returnVal;
                }
        );
    }
}
