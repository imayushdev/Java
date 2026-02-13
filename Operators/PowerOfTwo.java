package Operators;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if((num & num-1)  == 0){

            System.out.println("Yes ! The num is of power of two");
        }
        else{
            System.out.println("The num is not of power of two");
        }
    }
}
