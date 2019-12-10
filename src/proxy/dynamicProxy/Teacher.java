package proxy.dynamicProxy;

public class Teacher implements ITeacher{
    @Override
    public void teach() {
        System.out.println("teacher teaching...");
    }
}
