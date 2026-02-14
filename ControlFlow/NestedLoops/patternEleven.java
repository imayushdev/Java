package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternEleven {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
               }
            for (int j =1 ; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
