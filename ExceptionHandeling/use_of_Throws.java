package ExceptionHandeling;

import java.util.Scanner;

public class use_of_Throws extends Exception{
   public static void area () throws IllegalArgumentException {
       {
           System.out.println("Enter the radius");
           Scanner scanner = new Scanner(System.in);
           int radius = scanner.nextInt();
           if (radius <= 0) {
               throw new IllegalArgumentException("radius must be greater than 0");

           }
           else System.out.println(Math.PI*radius*radius);

       }
   }

    public static void main(String[] args) {

        try {
            area();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("BYE BYE !");
    }
}
