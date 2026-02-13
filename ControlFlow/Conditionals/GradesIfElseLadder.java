package ControlFlow.Conditionals;

import java.util.Scanner;

public class GradesIfElseLadder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("Enter the Marks you Scored");
        marks = scanner.nextInt();
      if (marks>=90){
          System.out.println("Grade: A");
      }
        else if ( marks >=70){
            System.out.println("Grade: B");
        }
        else if ( marks >=50){
            System.out.println("Grade: C");
        }
        else if ( marks >=30){
            System.out.println("Grade: D");
        }
        else{
          System.out.println("Grade : F");
      }
    }

}
