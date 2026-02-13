package ControlFlow.Loops;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        int flag=0;
        System.out.println("Enter the number which you want to check prime num or not");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double sqrt = Math.sqrt(num);

        for (int i =2; i<sqrt;i++) //optimized like till num/2 or sqrt of that num(best)
        {
            if (num % i == 0) {
                flag = 1;
                break;

            }
        }
            if(flag==1){
                System.out.println("Number is not prime");
            }
            else{
                System.out.println("The num "+ num +" is an prime num");
            }

        }
    }

