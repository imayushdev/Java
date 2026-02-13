package ControlFlow.Loops;

import java.util.Scanner;

public class CountDivisor {


    static int countDivisor(int num){
        int count=0 ,i;
        for (i=1;i<=num;i++){
            if (num%i==0){
                count++;
                System.out.println(i);

            }

        }
        return count;



    }

    public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
      int result =  countDivisor(num);
        System.out.println("total number of divisor of "+ num + " is = "+ result);

    }
}
