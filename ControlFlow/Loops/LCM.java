package ControlFlow.Loops;

import java.util.Scanner;

public class LCM {
    static int num1,num2,max,result;
    static int lcm (int num1,int num2){
        if(num1>num2){
           max =  num1;
        }
        else {
            max = num2;
        }
       int lcm = max;
        while(true){
            if( lcm%num1==0 && lcm%num2==0){
                result = lcm;
                break;

            }
           else {
                lcm += max;
            }
        }
        return lcm;

    }





    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        num1=scanner.nextInt();
        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        lcm(num1,num2);
        System.out.println("The lowest common multiple of the "+ num1 +" and "+num2 +" is = "+result);
        lcm(num1,num2);


    }
}
