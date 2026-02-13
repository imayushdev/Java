package InputOutputPractice;

import java.util.Scanner;

public class Nthfibonaccinum {
    public static void main(String[] args) {
        System.out.println("Enter which fibonacci num you want to know?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
       int i,  a =0,b=1,sum=0;
        for ( i =2;  i<num; i++){
            sum=a+b;
            a=b;
            b=sum;


        }
        System.out.println(sum);
    }
}
