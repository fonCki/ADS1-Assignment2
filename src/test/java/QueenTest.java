import org.example.Chessboard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QueenTest {
    // Test Cheesboard.java

    // Test no Found
    @Test
    public void testNoFoundWith2() {
        // Arrange
        Chessboard chessboard = new Chessboard(2);
        int[][] expected = null;
        // Act
        int[][] result = chessboard.getFirst();
        // Assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void testNoFoundWith3() {
        Chessboard chessboard = new Chessboard(3);
        int[][] expected = null;
        // Act
        int[][] result = chessboard.getFirst();
        //Assert
        assertArrayEquals(expected, result);
    }


    // Test getFirst()
    @Test
    public void testGetFirstWithFour() {
        //Arrange
        Chessboard chessboard = new Chessboard(4);
        int[][] expected = new int[][]{
                {0, 0, 1, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 1},
                {0, 1, 0, 0}
        };
        //Act
        int[][] actual = chessboard.getFirst();
        //Assert
        assertArrayEquals(expected, actual);
    }


    @Test
    public void testGetFirstWitTwelve() {
        //Arrange
        Chessboard chessboard = new Chessboard(12);
        int [][] expected = new int [][] {
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
        };
        //Act
        int[][] actual = chessboard.getFirst();
        //Assert
        assertArrayEquals(expected, actual);
    }

}
