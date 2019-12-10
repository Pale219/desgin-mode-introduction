package adapter.adapter4;

public interface HandlerAdapter {
    boolean support(Object handler);
    void doHandle(Object handler);
}

class AnnotationHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Object handler) {
        return handler instanceof AnnotationController;
    }

    @Override
    public void doHandle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }
}

class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Object handler) {
        return handler instanceof SimpleController;
    }

    @Override
    public void doHandle(Object handler) {
        ((SimpleController) handler).doSimpleHandler();
    }
}

class HttpRequsetHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean support(Object handler) {
        return handler instanceof HttpRequestController;
    }

    @Override
    public void doHandle(Object handler) {
        ((HttpRequestController) handler).doHttpRequestHandler();
    }
}
