package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternNine {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
