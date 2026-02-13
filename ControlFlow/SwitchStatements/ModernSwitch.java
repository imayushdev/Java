package ControlFlow.SwitchStatements;

import java.util.Scanner;

public class ModernSwitch {
    public static void main(String[] args) {
        System.out.println("Enter your choice(1 to 7)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch(choice){
            case 1 , 2,  3, 4,  5-> {
                System.out.println("Weekdays");
                System.out.println("Work!");
            }
            case 6,  7->{
                System.out.println("Weekends");
                System.out.println("Enjoy!");
            }
            default-> System.out.println("Invalid Choice");

        }
    }
}
