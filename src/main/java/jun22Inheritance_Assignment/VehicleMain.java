package jun22Inheritance_Assignment;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle v=new Vehicle("BMW","X5", 2023);
        v.start();
        v.stop();
        v.dispInfo();

        Car c=new Car("Honda", "Civic" , 2017, 4);
        c.start();
        c.stop();
        c.dispInfo();

        Motarcycle mc=new Motarcycle("Apache","rtr 310", 2015, 1);
        mc.start();
        mc.stop();
        mc.dispInfo();

        Electriccar ec=new Electriccar("Tesla","Y", 2023, 4, 60, 40);
        ec.start();
        ec.stop();
        ec.dispInfo();
    }
}
