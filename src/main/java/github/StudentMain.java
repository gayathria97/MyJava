package github;

public class StudentMain {
    public static void main(String[] args) {

        Student s=new Student("john",1620110,
                22,"cse",65);
        s.displayInfo();
        s.calculateAverageGrade();
    }
}
