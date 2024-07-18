package github;

public class StudentGrades extends Student {


    public StudentGrades(String name, int rollNumber, int age, String course,
                         double grade) {
        super(name, rollNumber, age, course, grade);
    }
    @Override
    public void displayInfo() {
        System.out.println("name: "+name);
        System.out.println("rollNumber: "+rollNumber);
        System.out.println("age: "+age);
        System.out.println("course: "+course);
        System.out.println("grade: "+grade);
    }
}
