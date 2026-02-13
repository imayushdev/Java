package ControlFlow.Loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        int sum =0;
        int  num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        num = scanner.nextInt();
        int x = num;
        for(;num!=0;){
            int d = num%10;
            sum +=d;
            num=num/10;

        }
        System.out.println("The sum of digits of num "+ x + " is : "+sum);
    }
}
