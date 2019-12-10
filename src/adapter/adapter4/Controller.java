package adapter.adapter4;

public interface Controller {
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }

}

class HttpRequestController implements Controller{
    public  void doHttpRequestHandler(){
        System.out.println("httpRequest...");
    }
}
