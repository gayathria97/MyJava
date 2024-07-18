package github;

public class Student {
       public String name;
       public int rollNumber;
       public int age;
       public String course;
       public double grade;

       public Student(String name, int rollNumber, int age, String course,
                      double grade){
           this.name = name;
           this.rollNumber = rollNumber;
           this.age = age;
           this.course = course;
           this.grade = grade;

       }
       public String getName(){

           return name;
       }
       public int getRollNumber(){

           return rollNumber;
       }
       public int getAge() {

           return age;
       }
       public String getCourse() {

           return course;
       }
       public double getGrade() {

           return grade;
       }
       public void setName(String name) {

           this.name = name;
       }
       public void setRollNumber(int rollNumber) {

           this.rollNumber = rollNumber;
       }
       public void setAge(int age) {

           this.age = age;
       }
       public void setCourse(String course) {

           this.course = course;
       }
       public void setGrade(double grade) {

           this.grade = grade;
       }

    public char calculateAverageGrade(int score){
           if(score>=90) {
               return 'A';
           }
           else if(score>=80){
               return 'B';
           }
           else if(score>=70){
               return 'C';
           }
           else if(score>=60){
               return 'D';
           }
           else if(score>=50){
               return 'F';
           }
        return 0;
    }

    public void displayInfo() {
        System.out.println("name: "+name);
        System.out.println("rollNumber: "+rollNumber);
        System.out.println("age: "+age);
        System.out.println("course: "+course);
        System.out.println("grade: "+grade);
    }

    public void calculateAverageGrade() {
        System.out.println("Average grade: ");
    }
}
