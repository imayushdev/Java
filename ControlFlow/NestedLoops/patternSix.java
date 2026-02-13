package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternSix {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=0;i<n;i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}