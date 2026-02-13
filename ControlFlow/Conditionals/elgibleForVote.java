package ControlFlow.Conditionals;

import java.util.Scanner;

public class elgibleForVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        System.out.println("Are you citizen of this country ?(True or False)");
        boolean isCitizen = scanner.hasNextBoolean();
        if (age>18 && isCitizen){
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("you are not eligible for vote");
        }
    }
}
