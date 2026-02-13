package ControlFlow.SwitchStatements;
import java.util.Scanner;

public class MonthUsingModern {

 static String monthName(int  choice){
   return switch(choice) {
     case 1 -> "January";

     case 2 -> "February";

     case 3 -> "March";

     case 4 -> "April";

     case 5 -> "May";

     case 6 -> "June";

     case 7 -> "July";

     case 8 -> "August";

     case 9 -> "September";

     case 10 -> "October";

     case 11 -> "November";

     case 12 -> ("December");

     default-> "Please enter valid choice";
 };



    }

    public static void main(String[] args) {
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        String result = monthName( choice);
        System.out.println("Result is "+ result);



    }
}