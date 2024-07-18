package jun22Inheritance_Assignment;

public class Vehicle {
    public String make;
    public String model;
    public int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;

    }
    public void start() {
        System.out.println("vehicle started ");
    }
    public void stop() {
        System.out.println("vehicle stopped ");
    }
    public void dispInfo() {
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
    }
}
