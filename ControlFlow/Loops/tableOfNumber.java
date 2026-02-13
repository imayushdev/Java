package ControlFlow.Loops;

import java.util.Scanner;

public class tableOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter number whose table you want to print");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i =0; i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}
