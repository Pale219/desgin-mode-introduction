package flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = WebSiteFactory.getInstance();
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("pale"));

        WebSite webSite2 = webSiteFactory.getWebSiteCategory("网站");
        webSite2.use(new User("zhengjun"));

        WebSite webSite3 = webSiteFactory.getWebSiteCategory("网站");
        webSite3.use(new User("zj"));

        webSiteFactory.printPoolCount();
    }
}
