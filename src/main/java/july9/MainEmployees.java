package july9;

import java.util.ArrayList;
import java.util.List;

public class MainEmployees {
    public static void main(String[] args){

        List<Employees> employeesList = new ArrayList<Employees>();

        Employees emp1=new Employees(2401,"Edward","florida","edward12@gmail.com",35);
       // emp1.setEmpAge();
        //list.add(emp1);
        Employees emp2=new Employees(2402,"John","ohio","john21@gmil.com",32);
        Employees emp3=new Employees(2403,"Mike","arizona","mike13@gmail.com",37);
        Employees emp4=new Employees(2404,"Chase","ohio","chase92@gmail.com",45);
        Employees emp5=new Employees(2405,"James","arizona","james13@gmail.com",50);
        employeesList.add(emp1);
        employeesList.add(emp2);
        employeesList.add(emp3);
        employeesList.add(emp4);
        employeesList.add(emp5);
        System.out.println(employeesList);

        for(int i=0;i< employeesList.size();i++){
        if(employeesList.get(i).getEmpCity().equals("arizona")){
        System.out.println(employeesList.get(i).getEmpName());
}
        }

        for( Employees e: employeesList){
            if(e.getEmpCity().equals("ohio")){
                System.out.println(e.getEmpName());

            }
        }

    }
}
