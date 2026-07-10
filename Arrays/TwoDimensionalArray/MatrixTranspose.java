package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter columns: ");
        int column = scanner.nextInt();

        int[][] matrix = new int[rows][column];


        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }


        System.out.println("Entered Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int[][] transpose = new int[column][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }


        System.out.println("Transpose Matrix:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}