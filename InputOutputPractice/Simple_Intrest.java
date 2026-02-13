package InputOutputPractice;

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principle amount");
        Scanner scanner=new Scanner(System.in);
        int Principal= scanner.nextInt();
        System.out.println("enter the rate");
        int Rate=scanner.nextInt();
        System.out.println("Enter the time ");
        int Time  = scanner.nextInt();
        int Simple_Interest=(Principal*Rate*Time)/100;
        System.out.println(Simple_Interest);
    }

}
