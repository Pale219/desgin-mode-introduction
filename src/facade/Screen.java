package facade;

public class Screen {
    private static Screen screen = new Screen();
    private Screen(){}

    public static Screen getInstance(){
        return screen;
    }

    public void up(){
        System.out.println("screen up");
    }

    public void down(){
        System.out.println("screen down");
    }
}
