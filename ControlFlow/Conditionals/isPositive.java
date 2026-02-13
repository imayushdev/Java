package ControlFlow.Conditionals;

import java.util.Scanner;

public class isPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no you want to check?");
        int num = scanner.nextInt();
        if(num>=0){
            System.out.println("The num is positive");

        }
        else {
            System.out.println("The num is not an positive number");
        }
    }
}
