package InputOutputPractice;

import java.util.Scanner;

public class TakingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter byte value");
        byte num1 = scanner.nextByte();
       // num1=byte(num1);
        //byte correct =(byte)(num1);
        System.out.println(num1);
        System.out.println("Enter short value");
        short num2=scanner.nextShort();
        System.out.println(num2);
        System.out.println("Enter integer");
        int num3=scanner.nextInt();
        System.out.println(num3);
        System.out.println("Enter long type value");
        long num4=scanner.nextLong();
        System.out.println(num4);
        System.out.println("Enter float type value");
        float num5= scanner.nextFloat();
        System.out.println(num5);
        System.out.println("Enter the double type value");
        double num6= scanner.nextDouble();
        System.out.println(num6);
    }
}
