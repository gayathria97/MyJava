package jun22AbstractClass_Assignment;

public class MediadeviceMain {
    public static void main(String[] args) {
        Audioplayer ap=new Audioplayer();
        Vedioplayer vp=new Vedioplayer();
        Imagedisplay id=new Imagedisplay();
        ap.displayDetails();
        vp.displayDetails();
        id.displayDetails();
        id.display();
        ap.play();
        vp.play();
    }
}
