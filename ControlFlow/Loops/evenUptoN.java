package ControlFlow.Loops;

import java.util.Scanner;

public class evenUptoN {
    public static void main(String[] args) {
        System.out.println("Enter upto which you want to print even numbers");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Even numbers upto "+num +" :");
        for (int i=1;i<=num;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
