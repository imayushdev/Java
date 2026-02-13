package ControlFlow.Conditionals;

import java.util.Scanner;

public class PasswordCracker
{static String Enteredpassword;
    public static void main(String[] args) {
        final String password = "Ayush";
        do {
            System.out.println("Enter the password ");
            Scanner scanner = new Scanner(System.in);
            Enteredpassword = scanner.nextLine();
            if (!(Enteredpassword.equals(password)) ){
                System.out.println("Try Again !!");
            }

        }while (!(Enteredpassword.equals(password)) );
        System.out.println("Acess Granted \n Enjoy!!");
    }



}
