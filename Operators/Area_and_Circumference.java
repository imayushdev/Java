package Operators;

import java.util.Scanner;

public class Area_and_Circumference {
    public static void main(String[] args) {
        final float pi = 3.14f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = scanner.nextDouble();
        double Area = pi *radius*radius;
        double Circumference = 2*pi*radius;
        System.out.println("The area of circle is =" + Area );
        System.out.println("The circumference of circle is = "+ Circumference);
    }
}
