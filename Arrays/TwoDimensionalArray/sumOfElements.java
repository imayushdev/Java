package TwoDimensionalArray;

import java.util.Scanner;

public class sumOfElements {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix is : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int sum =0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                 sum = sum + arr[i][j];
            }
        }
        System.out.println("Addition of elements of array is = "+ sum);
    }
}