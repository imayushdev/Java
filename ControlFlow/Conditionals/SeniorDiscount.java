package ControlFlow.Conditionals;

import java.util.Scanner;

public class SeniorDiscount {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age>65){
            System.out.println("Eligible for senior Discount");
        }
        else{
            System.out.println("Sorry !! You are not eligible for discount");
        }
    }
}
