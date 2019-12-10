package adapter.adapter4;

import java.util.ArrayList;
import java.util.List;

public class DispatchServlet {
    private List<HandlerAdapter> handlerAdapterList = new ArrayList<>();

    public DispatchServlet(){
        handlerAdapterList.add(new AnnotationHandlerAdapter());
        handlerAdapterList.add(new HttpRequsetHandlerAdapter());
        handlerAdapterList.add(new SimpleHandlerAdapter());
    }

    public void doDispatch(){
        Controller simpleController = new SimpleController();
        HandlerAdapter handlerAdapter = this.getHandler(simpleController);
        if(handlerAdapter!=null) {
            handlerAdapter.doHandle(simpleController);
        }
    }

    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter handlerAdapter : handlerAdapterList) {
            if(handlerAdapter.support(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        DispatchServlet dispatchServlet = new DispatchServlet();
        dispatchServlet.doDispatch();
    }
}
