package Methods;

import java.util.Scanner;

public class isEligible {
    static boolean iseligible(int age){
        if(age >18){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner= new Scanner(System.in);
        int age = scanner.nextInt();
        boolean iseligible=iseligible(age);
        if (iseligible) {
            System.out.println("you are eligible");
        }
        else System.out.println("Sorry you are not eligible");

    }
}
