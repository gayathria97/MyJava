package jun22Inheritance_Assignment;

public class Car extends Vehicle{
    public int numOfdoors;

    public Car(String make, String model, int year,int numOfdoors) {
        super(make, model, year);
        this.numOfdoors = numOfdoors;
    }
    @Override
    public void start() {
        System.out.println("car started ");
    }
    @Override
    public void stop() {
        System.out.println("car stopped ");
    }
    @Override
    public void dispInfo() {
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println("numOfdoors: "+numOfdoors);
    }
}
