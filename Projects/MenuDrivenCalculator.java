package Projects;

import java.util.Scanner;

  public class MenuDrivenCalculator {


    int  num1,num2;
    static int choice;
    int add (int num1,int num2 ) {
        System.out.println("Enter the First number");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2=scanner.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    int subtraction (int num1,int num2)
    {System.out.println("Enter the First number");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2=scanner.nextInt();
        int subtraction = num1-num2;
        return  subtraction;

    }
        int multiplication (int num1,int num2)
        {System.out.println("Enter the First number");
            Scanner scanner = new Scanner(System.in);
            num1 = scanner.nextInt();
            System.out.println("Enter second number");
            num2=scanner.nextInt();
             int multiplication= num1*num2;
            return  multiplication;

    }
    int division (int num1,int num2) {
        System.out.println("Enter the First number");
        Scanner scanner = new Scanner(System.in);
        num1 = scanner.nextInt();
        System.out.println("Enter second number");
        num2 = scanner.nextInt();
        int divsion = 0;
        if (num2 == 0) {
            System.out.println("Undefined behaviour");
        } else {
            divsion = num1 / num2;

        }
        return divsion;
    }
    int modulus (int num1,int num2)
          {
              System.out.println("Enter the First number");
              Scanner scanner = new Scanner(System.in);
              num1 = scanner.nextInt();
              System.out.println("Enter second number");
              num2 = scanner.nextInt();
              int modulus = num1 % num2;
              return modulus;
    }
    int calculator(int choice) {
        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> subtraction(num1, num2);
            case 3 -> multiplication(num1, num2);
            case 4 -> division(num1, num2);
            case 5 -> modulus(num1, num2);
            default -> 0;
        };



    }

    public static void main(String[] args) {
        do {
            System.out.println("*****************Calculator******************");
            System.out.println("Press 1 for Addition\nPress 2 for Subtraction\nPress 3 for" +
                    "multiplication\n Press 4 for Division\nPress 5 for Modulus\nPress 6 for exit");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
//
            MenuDrivenCalculator obj = new MenuDrivenCalculator();
            int result = obj.calculator(choice);
            System.out.println("Result = " + result);
            if(choice==6){
                System.out.println("exiting.......");
                break;
            }
        }
        while(choice<6);


    }
}
