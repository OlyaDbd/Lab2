package com.lab2;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void firstTest() {
        int[][] matrix = {{2, 2, 3}, {4, 5, 3}, {6, 6, 6}};
        int minElem;
        Main.printMatrix(matrix);
        minElem = Main.minElement(matrix);
    }

    @Test
    void secondTest() {
        int[][] matrix = {{4, 4, 5, 5}, {4, 6, 8, 9}, {6, 6, 6, 7}, {9, 5, 7, 8}};
        int minElem;
        Main.printMatrix(matrix);
        minElem = Main.minElement(matrix);
    }

    @Test
    void thirdTest() {
        int[][] matrix = {{4, 4, 4}, {5, 5, 5}, {6, 6, 7}, {8, 8, 8}};
        int minElem;
        Main.printMatrix(matrix);
        minElem = Main.minElement(matrix);
    }
}
