package jun22Polymorphism_Assignment;

public class Employee {
    public int empid;
    public String empname;

    public Employee(int empid,String empname) {
        this.empid = empid;
        this.empname = empname;

    }
    public void calculatePay() {
        System.out.println("employee calcpay: ");
    }
}
