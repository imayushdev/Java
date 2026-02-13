package InputOutputPractice;

import java.util.Scanner;

public class FizzBUzz {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //System.out.println("The numbers upto "+ n + " are : ");
//        for (int i =0;i<=n;i++){
//            System.out.println(i);
//            }
        //System.out.println("The fizz numbers are :  ");
        for (int i =1;i<=n;i++) {
             if(i % 3 == 0 && i % 5 == 0) {

                 System.out.println("Fizz Buzz");
             }

            else if (i % 3 == 0) {

                System.out.println( "Fizz");
            }
            else if (i % 5 == 0) {

                System.out.println("Buzz");

            }

            else{
                System.out.println(i);
            }
        }

    }
}
