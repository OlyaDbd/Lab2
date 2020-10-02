package com.lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter size of row: ");
            int row = scanner.nextInt();
            System.out.println("Enter size of column: ");
            int column = scanner.nextInt();

            if (row == 0 || column == 0) {
                throw new Exception("Matrix size = 0");
            }

            int[][] matrix = new int[row][column];
            createRandomMatrix(matrix);
            printMatrix(matrix);
            printSortMatrix(matrix);
            minElement(matrix);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static void createRandomMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] elem : matrix) {
            for (int col : elem) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static int[] sortMatrix(int[][] matrix) {
        int[] flat = new int[matrix.length * matrix[0].length];
        int ctr = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                flat[ctr++] = matrix[i][j];
            }
        }

        Arrays.sort(flat);

        return flat;
    }

    static void printSortMatrix(int[][] matrix) {
        int[] array = sortMatrix(matrix);
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    static int minElement(int[][] matrix) {
        int[] array = sortMatrix(matrix);
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print("Minimal element: " + array[i] + " ");
                return array[i];
            }
        }
        return 0;
    }
}
