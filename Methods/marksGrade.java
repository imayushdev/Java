package Methods;

import java.util.Scanner;

public class marksGrade {
    char Grade (int marks){
        marks = marks/10;
        if(marks>=8){
            return 'A';
        }
        else if (marks>=6){
            return 'B';
        }
        else if (marks>=4){
            return 'c';
        }
        else if (marks>=2){
            return 'D';
        }
else return 'F';
    }

    public static void main(String[] args) {
        System.out.println("Enter your marks");
        Scanner scanner= new Scanner(System.in);
        int marks = scanner.nextInt();
        marksGrade object = new marksGrade();
        char grade = object.Grade(marks);
        System.out.println("Your grade is "+ grade);
    }
}
