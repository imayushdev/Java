package ControlFlow.Loops;

import java.util.Scanner;

public class perfectOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to check ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x = num, sum = 0;
        for (int i = 1; i < num; i++)//till half optimized and universal
        {

        if (num % i == 0) {
                sum += i;

            }

        }
        if (sum == x) {
            System.out.println("The number is perfect number.");
        } else {
            System.out.println("The number is not perfect number.");
        }
    }
}
