package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternEight {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");

//            for(int j=i;j<=i;j++){
//                System.out.print(" ");
//            }
//            for (int j = n;j>2*i;j-- ){
//                System.out.print("*");
//            }

            }
            System.out.println();
        }
    }
}
