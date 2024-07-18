package jun22AbstractClass_Assignment;

public class Vedioplayer extends Mediadevice{
    public String vediotitle;
    public int duration;


    @Override
    public void displayDetails() {
        System.out.println("vedioplayer details: ");
    }
    public void play() {
        System.out.println("vedio is playing: ");
    }
}
