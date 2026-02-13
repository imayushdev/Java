package Methods;

import java.util.Scanner;

public class Price {
    static double totalPrice;
   static  double priceCheck(int quantity,double price , boolean isMember){
       if(isMember){
          totalPrice =  (price*quantity*.85);
       }
       else {
            totalPrice = price*quantity;
       }
       return totalPrice;
   }

    public static void main(String[] args) {
        System.out.println("Enter the quantity");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        System.out.println("Enter the price");
        double price =scanner.nextDouble();
        System.out.println("Are you are prime member (true or false)");
       boolean  isMember = scanner.nextBoolean();
         double total = priceCheck(quantity,price,isMember);
        System.out.println("Your total amount is "+ total);
    }
}
