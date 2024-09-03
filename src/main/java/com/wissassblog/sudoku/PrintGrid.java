package com.wissassblog.sudoku;

public class PrintGrid {
    public static void printGrid (int [][]initialState) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(initialState[i][j] + " ");
            }
            System.out.println();
        }
    }
}
