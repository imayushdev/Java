package InputOutputPractice;

import java.util.Scanner;

public class ProductFloatingNum
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first floating point num");
        float num1= scanner.nextFloat();
        System.out.println("Enter the second floating point num");
       float num2 = scanner.nextFloat();
       float product= num1*num2;
        System.out.println(product);

    }
}
