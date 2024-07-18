package jun22Inheritance_Assignment;

public class Motarcycle extends Vehicle{
    public int numOfcylinders;

    public Motarcycle(String make, String model, int year,int numOfcylinders) {
        super(make, model, year);
        this.numOfcylinders = numOfcylinders;
    }
    public void start() {
        System.out.println("Motarcycle started ");
    }
    public void stop() {
        System.out.println("Motarcycle stopped ");
    }
    public void dispInfo() {
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println("numOfcylinders: "+numOfcylinders);
    }
}
