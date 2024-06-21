package Studentscore;

public class Studentscore {

    int input;

    public void marks(int input) {
        if(input >=90 && input <=100) {
            System.out.print("A");
        }
        else if(input >= 80 && input <=89) {
            System.out.print("B");
        }
        else if(input >= 70 && input <=79) {
            System.out.print("c");
        }
        else if(input >= 60 && input <=69) {
            System.out.print("d");
        }
        else if(input < 60) {
            System.out.print("F");
        }

    }
}
