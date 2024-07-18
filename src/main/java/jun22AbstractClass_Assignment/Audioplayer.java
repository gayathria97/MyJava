package jun22AbstractClass_Assignment;

public class Audioplayer extends Mediadevice{
    public String songname;
    public String artist;


    @Override
    public void displayDetails() {
        System.out.println("audioplayer details: ");
    }
    public void play() {
        System.out.println("audio is playing: ");
    }
}
