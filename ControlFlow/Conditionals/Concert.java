package ControlFlow.Conditionals;

import java.util.Scanner;

public class Concert
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Are you invited to concert ?(True OR False)");
        boolean isTicket=scanner.nextBoolean();
        System.out.println("Are you an VIP?(True OR False)");
        boolean isVIP=scanner.nextBoolean();
        if (age>=18 && (isTicket || isVIP)){
            System.out.println("You can enjoy the concert");
        }
        else{
            System.out.println("Sorry !1 you are not Allowed");
        }
    }
}
