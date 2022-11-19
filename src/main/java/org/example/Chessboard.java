package org.example;

import java.util.ArrayList;
import java.util.List;

public class Chessboard {
    int n;

    public Chessboard(int n) {
        this.n = n;
    }
    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    boolean solve(int board[][], int col)  {
        if (col >= n)
            return true;

        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col)) {

                board[i][col] = 1;
                if (solve(board, col + 1)) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    void printSolution(int board[][]) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }


    public int[][] getFirst() {
        int board[][] = new int[n][n];
        if (solve(board, 0))
            return board;
        return null;
    }
}
