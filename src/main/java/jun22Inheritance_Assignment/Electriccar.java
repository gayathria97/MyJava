package jun22Inheritance_Assignment;

public class Electriccar extends Car{
    public int batteryCapacity;
    public int chargeBattery;

    public Electriccar(String make, String model, int year,int numOfdoors,
                         int batteryCapacity,int chargeBattery) {
        super(make, model, year, numOfdoors);
        this.batteryCapacity = batteryCapacity;
        this.chargeBattery = chargeBattery;
    }

    public void start() {
        System.out.println("electriccar started ");
    }

    public void stop() {
        System.out.println("electriccar stopped ");
    }

    public void dispInfo() {
        System.out.println("make: "+make);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println("batteryCapacity: "+batteryCapacity);
        System.out.println("chargeBattery: "+chargeBattery);
    }
}
