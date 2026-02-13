package ControlFlow.Loops;

import java.util.Scanner;

public class SumOFNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ,sum=0;
       // num = scanner.nextInt();
        System.out.println("Enter the number upto you want to sum");
        num = scanner.nextInt();
        for(int i =1;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum is : "+ sum);


    }
}
