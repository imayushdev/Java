package ControlFlow.SwitchStatements;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        int choice ;
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
         choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
