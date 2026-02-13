package ControlFlow.Conditionals;

import java.util.Scanner;

public class Leap_Year
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = scanner.nextInt();
//        if(year%4==0){
//            System.out.println("The year " + year +"is the leap year");
//
//        }
//        else if (year%100==0 && year%400==0) {
//            System.out.println("The year " + year + "is the leap year");
//        }
//        else {
//            System.out.println("The year " + year + "is not the leap year");
          if ((year%4==0 && year%100!=0 )|| year%400 ==0){
              System.out.println("The year is the leap year");
        }
          else{
              System.out.println("The year is not the leap year");
          }
    }
}
