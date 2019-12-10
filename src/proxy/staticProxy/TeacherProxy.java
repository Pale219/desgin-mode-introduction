package proxy.staticProxy;

public class TeacherProxy implements ITeacher{
    private ITeacher iTeacher;

    public TeacherProxy(ITeacher iTeacher) {
        this.iTeacher = iTeacher;
    }

    @Override
    public void teach() {
        System.out.println("调用之前可以xxxx");
        iTeacher.teach();
        System.out.println("调用之后也可以xxx");
    }
}
