package OneDimensionalArray;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements of array");
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Enter the array elements");
        int []arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Entered array is :");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nReverse of array is :");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
