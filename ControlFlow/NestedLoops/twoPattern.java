package ControlFlow.NestedLoops;

import java.util.Scanner;

public class twoPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i=1;i<=rows;i++){
            for (int j=i;j<=rows-1;j++){
                System.out.print("  ");
            }
           for (int j=1;j<=i;j++){
               System.out.print("*");
           }

            System.out.println(" ");
        }


    }
}
