package TwoDimensionalArray;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        System.out.println("Enter the number of rows of first matrix ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of Columns of first matrix");
        columns = scanner.nextInt();
        System.out.println("Enter the number of rows of second matrix ");
        int row = scanner.nextInt();
        System.out.println("Enter the number of Columns of second matrix");
        int column = scanner.nextInt();
        if (columns!=row) {
            System.out.println("Invalid row and column input");
            System.out.println("column of first matrix must equals to the rows of second matrix !!");
        }
        else{

        int[][] firstMatrix = new int[rows][columns];
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
                System.out.print(firstMatrix[i][j] + " ");

            }
            System.out.println();
        }
//        System.out.println("Enter the number of rows of second matrix ");
//        int row = scanner.nextInt();
//        System.out.println("Enter the number of Columns of second matrix");
//        int column = scanner.nextInt();
        int[][] secondMatrix = new int[row][column];
        System.out.println("Enter the elements of second matrix for multiplication");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.println(" [" + i + "][" + j + "] =");
                secondMatrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The second  matrix is =");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print(secondMatrix[i][j] + " ");

            }
            System.out.println();
        }
//        if (columns!=row) {
//            System.out.println("Invalid row and column input");
//            System.out.println("column of first matrix must equals to the rows of second matrix !!");
//        }
//        else{
            int[][] multiplication = new int[rows][column];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    multiplication[i][j] = 0;
                    for (int k = 0; k < column; k++) {
                        multiplication[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                    }
                    }
                }
                System.out.println("Resultant matrix is : ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < column; j++) {
                        System.out.print(multiplication[i][j] + " ");
                    }
                    System.out.println();
                }
            }


        }
    }

