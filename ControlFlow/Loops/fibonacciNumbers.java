package ControlFlow.Loops;

import java.util.Scanner;

public class fibonacciNumbers {
    public static void main(String[] args) {int sum;
        System.out.println("Enter upto which you want to print fibonacci numbers");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("0 \n1" );
        int a = 0, b=1;
        for (int i=2;i<num;i++){
            sum = a+b;
            a=b;
            b=sum;

            System.out.println(sum);
        }

    }
}
