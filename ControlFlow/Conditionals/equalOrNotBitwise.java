package ControlFlow.Conditionals;

import java.util.Scanner;

public class equalOrNotBitwise {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST NUMBER");
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int num2=scanner.nextInt();
      if((num1^num2)==0){
          System.out.println("The numbers are equal");
      }
      else{
          System.out.println("The numbers are not equal");
      }
    }
}
