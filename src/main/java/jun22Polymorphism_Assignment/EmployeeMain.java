package jun22Polymorphism_Assignment;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee e=new Employee(20222024,"edward");
        e.calculatePay();

        FulltimeEmployee fte=new FulltimeEmployee(202122024, "richard");
        fte.calculatePay();

        ParttimeEmployee pte=new ParttimeEmployee(2021232024, "john");
        pte.calculatePay();
    }
    }

