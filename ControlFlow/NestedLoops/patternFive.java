package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternFive {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i =1;i<n;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
