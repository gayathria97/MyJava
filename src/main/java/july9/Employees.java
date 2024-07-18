package july9;

public class Employees {


    public int empid;
   public String empName;
   public String empCity;
   public String empEmail;
    public int empAge;

    @Override
    public String toString() {
        return "Employees{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empCity='" + empCity + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empAge=" + empAge +
                '}';
    }


    public Employees(int empid, String empName, String empCity, String empEmail, int empAge) {
        this.empid = empid;
        this.empName = empName;
        this.empCity = empCity;
        this.empEmail = empEmail;
        this.empAge = empAge;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }


}
