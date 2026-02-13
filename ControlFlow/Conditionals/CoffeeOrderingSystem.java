package ControlFlow.Conditionals;

import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************\n");
        System.out.println("\u263A  WELCOME TO OUR CAFE!!  \u2615 ");
        System.out.println("\n******************************************************\n");
        System.out.println("Choose your coffee: ");
        System.out.println("\n1. Espresso _ ₹200");
        System.out.println("\n2. Cappuccino _ ₹250");
        System.out.println("\n3. Latte _ ₹300");
        int choice;
        double bill =0;

        System.out.println("Enter your Choice: ");
        choice = scanner.nextInt();
        if(choice==1){
            bill+=200;
        }
        else if (choice==2){
            bill+=250;
        } else if (choice==3) {
            bill+=300;
        }
        System.out.println("Add whipped cream for ₹30? (yes=1, no=0)");
            int whippedCreamChoice = scanner.nextInt();
            if (whippedCreamChoice==1){
                bill+=30;
            }
            else {
                System.out.println("Add a flavour shot?(Vanilla for ₹20 or Hazelnut for ₹25(yes=1 or no =0))");
                ;


                int flavourShot = scanner.nextInt();
                if (flavourShot == 1) {
                    System.out.println("Which one you want to add?(1 for vanilla or 2 for Hazelnut");
                    int Flavour = scanner.nextInt();
                    if (Flavour == 1) {
                        bill += 20;
                    } else if (Flavour == 2) {
                        bill += 25;
                    } else {
                        System.out.println("Enter the Valid choice");
                    }
                }


            }
        System.out.println("Total Amount = ₹" + bill);
        System.out.println("Thanks!! \u263A");
        }

    }

