package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixAddition {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int rows,column;
        System.out.println("Enter the number of rows");
        rows = scanner.nextInt();
        System.out.println("Enter the number of Columns ");
         column = scanner.nextInt();
        int[][] firstMatrix = new int[rows][column];
        System.out.println("Enter the elements of first matrix");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.println(" [" + i + "][" + j + "] =");
                firstMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The first matrix is =");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print(firstMatrix[i][j]+ " ");

            }
            System.out.println();
        }
        int[][] secondMatrix = new int[rows][column];
        System.out.println("Enter the elements of second matrix");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {

                System.out.println(" [" + i + "][" + j + "] =");
                secondMatrix[i][j] = scanner.nextInt();
            }
        }

            System.out.println("Second matrix is = ");
            for (int i = 0; i < secondMatrix.length; i++) {
                for (int j = 0; j < secondMatrix[i].length; j++) {
                   // System.out.println("element [" + i + "][" + j + "] =");
                    System.out.print(secondMatrix[i][j] + " ");
                }
                System.out.println();
            }
            int [][]sum=new int[rows][column];
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        System.out.println("Addition of matrix is =");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print(sum[i][j]+ " ");
            }
            System.out.println();
        }

        }
    }

