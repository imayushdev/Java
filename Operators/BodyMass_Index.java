package Operators;

import java.util.Scanner;

public class BodyMass_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight inn kg");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height in meters");
        double height = scanner.nextDouble();
        double bodymass_index=(weight / (height*height));
        System.out.println("The body mass index is = "+ bodymass_index);
    }
}
