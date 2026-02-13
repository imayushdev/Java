package ControlFlow.Conditionals;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check.");
        Scanner scanner = new Scanner(System.in) ;
       int num= scanner.nextInt();

        if (num>0){
            System.out.println("The number is an positive number.");

        }
        else if(num<0){
            System.out.println("The number is negative number.");
        }
        else{
            System.out.println("The number is zero.");
        }
    }
}
