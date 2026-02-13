package ControlFlow.Loops;

import java.util.Scanner;

public class gcdOptimized {static int temp,num1,num2;
   static int gcd(int num1, int num2) {
       while (num2 != 0) {
           int temp;
           temp = num2;
           num2 = num1 % num2;
           num1 = temp;
           //return num2;
       }
       return num1;
   }
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        num1= scanner.nextInt();
        System.out.println("Enter second number");
        num2=scanner.nextInt();
        int result = gcd(num1,num2);
        System.out.println("Greatest common divisor of the "+ num1 +" and "+num2 +" is = "+result);
    }
}
