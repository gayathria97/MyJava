package jun22AbstractClass_Assignment;

public class Imagedisplay extends Mediadevice{
    public String imagename;
    public int resolution;


    @Override
    public void displayDetails() {
        System.out.println("image details: ");
    }
    public void display() {
        System.out.println("image is displaying: ");
    }
}
