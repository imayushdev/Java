package ControlFlow.Conditionals;

import java.util.Scanner;

public class checkEvenOddUsingBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num you want to check");
        int num = scanner.nextInt();
        if((num & 1) ==0){
            System.out.println("The Number " + num + " is an Even number");
        }
        else{
            System.out.println("The Number " + num + " is an odd number");
        }
    }
}
