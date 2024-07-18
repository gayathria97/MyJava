package jun22Polymorphism_Assignment;

public class FulltimeEmployee extends Employee{
    public FulltimeEmployee(int empid, String empname) {
        super(empid, empname);
    }

    public void calculatePay() {
        System.out.println("fulltimeemployee calcpay: ");
    }
}
