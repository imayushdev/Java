package ControlFlow.Loops;

import java.util.Scanner;

public class optimizedLCM {
   static int lcm (int num1 , int num2) {
       int a=num1,b=num2;
       while (num2 != 0) {

           int temp = num2;
           num2 = num1 % num2;
           num1 = temp;

       }
       int gcd = num1;
      int  lcm  = (a*b)/gcd;
      return lcm;
   }
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int num2 = scanner.nextInt();
        int result =  lcm(num1,num2);
        System.out.println("lowest common factor of the "+ num1 +" and "+num2 +" is = "+result);

    }
}
