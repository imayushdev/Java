package ControlFlow.SwitchStatements;

import java.util.Scanner;

public class NumberGuesssimple
{ static int num;
    public static void main(String[] args) {
        do {

                System.out.println("Enter the number");
                Scanner scanner = new Scanner(System.in);
                 num = scanner.nextInt();

            if (num > 50) {

                System.out.println("invalid number\nPlease try again!!");
            } else {
                System.out.println("Thanks!!");
            }
        }while(num>50);
    }
}
