package Methods;

import java.util.Scanner;

public class isPrime {
    static int num, flag = 0;

    int checkPrime(int a) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
               break;
            }


        }
        return flag;

    }
        public static void main (String[]args){
            System.out.println("Enter the number you want to check");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            isPrime obj = new isPrime();
           int flag=  obj.checkPrime(num);
            if (flag == 1) {
                System.out.println("The num " + num + " is not an prime num");
            }
            else {
                System.out.println("The num " + num + " is  an prime num");
            }
        }

}
