package flyweight;

import java.util.HashMap;

public class WebSiteFactory {
    private static WebSiteFactory webSiteFactory;
    private HashMap<String,ConcreteWebSite> pool;

    private WebSiteFactory(){
        pool = new HashMap<>();
    }

    public static WebSiteFactory getInstance(){
        if(webSiteFactory == null){
            synchronized (WebSiteFactory.class){
                if(webSiteFactory==null){
                    webSiteFactory = new WebSiteFactory();
                }
            }
        }
        return webSiteFactory;
    }


    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    public void printPoolCount(){
        System.out.println(pool.size());
    }
}
