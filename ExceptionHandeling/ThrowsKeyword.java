package ExceptionHandeling;

import java.util.Scanner;

public class ThrowsKeyword {
     void userDetails() throws NullPointerException, ArithmeticException {
         String name = null;
         System.out.println("Enter Your Name");{
             Scanner scanner = new Scanner(System.in);
             name = scanner.nextLine();
             //System.out.println(name);
             System.out.println("Enter Your Age");
             int age = scanner.nextInt();
             System.out.println("Name is " + name + "Age is " +age);
             if(age<=0 || age>100){
                 throw new ArithmeticException("Invalid Age");
             }

         }
     }
    public static void main(String[] args) {
         ThrowsKeyword k = new ThrowsKeyword();
         try {
              k.userDetails();
             System.out.println("You Are Verified User!!");
         }catch(NullPointerException | ArithmeticException e){
             System.out.println(e.getMessage());
         }


         }


    }


