package Operators;

import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        System.out.println("Before Swapping:\nnum1 = " +num1 + "\nnum2 =  "+ num2);
        num1 = num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After Swapping: \nnum1 = " +num1 + "\nnum2 =  "+ num2);

    }
}
