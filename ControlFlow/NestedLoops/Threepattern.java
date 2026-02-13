package ControlFlow.NestedLoops;

import java.util.Scanner;

public class Threepattern {

    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >=i; j--) {
                System.out.print("*");
            }

            System.out.print("\n");


        }
    }
}