package ControlFlow.SwitchStatements;

import java.util.Scanner;

public class GradesUsingSwitch {
    static int marks;

    public static void main(String[] args) {
        do {
            System.out.println("Enter your marks(1 to 100)");
            Scanner scanner = new Scanner(System.in);
            marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Please Enter valid marks !!");
            } else {
                marks /= 10;

                switch (marks) {
                    case 10, 9 -> System.out.println("Grade : A");
                    case 8, 7 -> System.out.println("Grade : B");
                    case 6, 5 -> System.out.println("Grade : C");
                    case 4, 3 -> System.out.println("Grade : D");
                    case 2, 1 -> System.out.println("Grade : E");
                    default -> System.out.println("Grade : F");

                }

            }


        }while(marks < 0 || marks > 100 );
        System.out.println("Party toh banti hai !!");
    }
}
