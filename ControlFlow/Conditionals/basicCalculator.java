package ControlFlow.Conditionals;

import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        int Choice, num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1 : Addition\n2 : Subtraction\n3 : Multiplication\n4 : devison\n5 : Modulous");
        System.out.println("Enter your Choice(1 to 5)");
        Choice = scanner.nextInt();
        System.out.println("Enter the first number");
        num1= scanner.nextInt();
        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        if (Choice == 1) {
            System.out.println("Addition is = " + (num1 + num2));
        } else if (Choice == 2) {
            System.out.println("Subtraction is = " + (num1 - num2));
        } else if (Choice == 3) {
            System.out.println("Multiplication is = " + num1 * num2);
        }
        else if ( Choice == 4) {
            System.out.println("Devision is = " + (num1 / num2));
        }
        else if ( Choice == 5) {
            System.out.println("Remainder  is = " + (num1 % num2));
        }
        else{
            System.out.println("Enter Valid Choice");
        }
    }
}