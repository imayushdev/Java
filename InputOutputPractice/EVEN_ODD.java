package InputOutputPractice;

import java.util.Scanner;

public class EVEN_ODD {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num = scanner.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
else {
            System.out.println("The number is odd");
        }
    }

}
