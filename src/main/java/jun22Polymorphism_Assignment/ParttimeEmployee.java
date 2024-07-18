package jun22Polymorphism_Assignment;

public class ParttimeEmployee extends Employee{
    public ParttimeEmployee(int empid, String empname) {
        super(empid, empname);

    }
    @Override
    public void calculatePay() {
        System.out.println("parttimeemployee calcpay: ");
    }
}
