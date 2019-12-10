package facade;

public class Facade {
    private DVDPlayer dvdPlayer;
    private Screen screen;

    public Facade(){
        dvdPlayer = DVDPlayer.getInstance();
        screen = Screen.getInstance();
    }

    public void facedeOn(){
        dvdPlayer.on();
        screen.down();
    }

    public void facedeOff(){
        dvdPlayer.off();
        screen.up();
    }
}
