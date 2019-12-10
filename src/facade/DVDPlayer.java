package facade;

public class DVDPlayer {
    private static DVDPlayer dvdPlayer= new DVDPlayer();
    private DVDPlayer(){}

    public static DVDPlayer getInstance(){
        return dvdPlayer;
    }

    public void on(){
        System.out.println("DVD Player on");
    }

    public void off(){
        System.out.println("DVD Player off");
    }
}
