package ControlFlow.Loops;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int min,gcd;
        System.out.println("Enter the first number ");

        Scanner scanner = new Scanner(System.in);
        int num1= scanner.nextInt();
        System.out.println("Enter the second number");
        int num2= scanner.nextInt();

        if(num1<num2){
            min = num1;
        }
        else{
            min = num2;
        }
        gcd =min;
        for(int i = min; i>=1; i--){
            if((num1%i & num2%i)==0) {
              gcd = i;
                break;


            }

        }

        System.out.println("Greatest common divisor of "+ num1 +" and " +num2+ " is : "+ gcd);

    }
}
