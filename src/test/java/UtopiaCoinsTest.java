import org.example.UtopiaCoins;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtopiaCoinsTest {
    @Test
    public void TestChangeCoinsWithZero() {
        //Arrange
        int n = 0;
        int expected = 0;
        //Act
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        //Assert
        assertEquals(expected, actualRecursive);
        assertEquals(expected, actualWithCache);
    }

    @Test
    public void TestChangeCoinsWithOne() {
        //Arrange
        int n = 1;
        int expected = 1;
        //Act
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        //Assert
        assertEquals(expected, actualRecursive);
        assertEquals(expected, actualWithCache);
    }

    @Test
    public void TestChangeCoinsWithTen() {
        //Arrange
        int n = 10;
        int expected = 1;
        //Act
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        //Assert
        assertEquals(expected, actualRecursive);
        assertEquals(expected, actualWithCache);
    }

    @Test
    public void TestChangeCoinsWithTwenty() {
        //Arrange
        int n = 20;
        int expected = 2;
        //Act
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        //Assert
        assertEquals(expected, actualRecursive);
        assertEquals(expected, actualWithCache);
    }

    @Test
    public void TestChangeCoinsWithSeventyFive() {
        //Arrange
        int n = 75;
        int expected = 6;
        //Act
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        //Assert
        assertEquals(expected, actualRecursive);
        assertEquals(expected, actualWithCache);
    }

    @Test
    public void TestEfficiencyAndSpeedOfBothMethods() {
        //Arrange
        int n = 60;
        //Act
        long startTimeRecursive = System.nanoTime();
        int actualRecursive = UtopiaCoins.findMinCoinsRecursive(n);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = (endTimeRecursive - startTimeRecursive);
        System.out.println("Recursive: " + durationRecursive);
        long startTimeDynamic = System.nanoTime();
        int actualWithCache = UtopiaCoins.findMinCoinsDynamicApproach(n);
        long endTimeDynamic = System.nanoTime();
        long durationDynamic = (endTimeDynamic - startTimeDynamic);
        System.out.println("Dynamic: " + durationDynamic);
        //Assert
        assertEquals(actualRecursive, actualWithCache);
    }
}
