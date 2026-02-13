package ControlFlow.Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number whose factorial you want to find");
        int num = scanner.nextInt();
        for (int i =1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of the "+num + " is : "+ fact);
    }

}
