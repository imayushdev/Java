package ControlFlow.NestedLoops;

import java.util.Scanner;

public class patternSeven {
    public static void main(String[] args) {
        System.out.println("Enter the Value of n");
        Scanner scanner = new Scanner(System.in);
        int i ,j,num;
         num =  scanner.nextInt();
        for ( i=1;i<=num;i++){
            for ( j=num;j>=num-j;j--){
                System.out.print(" ");
            }
            for (j=1;j<=2*(num-i)+1;j++){   // i-1 also can use for spaces
                System.out.print("*");
            }
            System.out.println( );
        }
    }

}
