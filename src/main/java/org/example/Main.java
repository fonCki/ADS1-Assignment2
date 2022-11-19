package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //n queens problem
        int n = 16;
        Chessboard chessboard = new Chessboard(n);
        int[][] result = chessboard.getFirst();
        if (result != null) {
            chessboard.printSolution(result);
        } else {
            System.out.println("No solution");
        }
        //Utopia Coins
        //see Test file
    }
}