package ControlFlow.Loops;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println("Enter the num you want to check weather palindrome or not?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = num;
        int rev=0;
        for (;num!=0;){
            int d = num%10;
            rev = rev*10+d;
            num = num/10;

        }
        if(rev == x){
            System.out.println("The number "+ x + " is an palindrome number");
        }
        else {
            System.out.println("The number "+ x + " is not  an palindrome number");
        }
    }
}
