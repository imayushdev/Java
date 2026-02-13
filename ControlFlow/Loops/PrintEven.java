package ControlFlow.Loops;

public class PrintEven {
    static int i;
   static int  even(int n) {
       int result = 0;
       for (i = 1; i <= n; i++) {
           if (i % 2 == 0) {
               result = 0;
               result = result + i;
           }
       }

       return result;
   }
    public static void main(String[] args) {
        System.out.println("Enter the value upto which you want to print even numbers?");

        int result =even(50);
        System.out.println("Result is :"+ result);
    }
}
