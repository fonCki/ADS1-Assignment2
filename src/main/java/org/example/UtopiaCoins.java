package org.example;

import java.util.HashMap;

public class UtopiaCoins {
     enum COIN {
        ONE(1),
        SEVEN(7),
        TEN(10),
        TWENTY_TWO(22);

        private int V;

        COIN(int value) {
            this.V = value;
        }
    }


    //Recursive function to find the minimum number of coins, every coin has value 1, 7, 10, 22
    private static int findMinCoinsRec(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (COIN coin : COIN.values()) {
                int res = findMinCoinsRec(n - coin.V);
            if (res != -1 && res < min) {
                min = res + 1;
            }
        }
        return min;
    }

    //Create recursive function to find the minimum number of coins, every coin has value 1, 7, 10, 22 using dynamic programming, building a table



    private static HashMap<Integer, Integer> map = new HashMap<>();

    private static int findMinCoinsRecursiveWithCache(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int min = Integer.MAX_VALUE;
        for (COIN coin : COIN.values()) {
            int res = findMinCoinsRecursiveWithCache(n - coin.V);
            if (res != -1 && res < min) {
                min = res + 1;
            }
        }
        map.put(n, min);
        return min;
    }

    public static int findMinCoinsRecursive(int n) {
        return findMinCoinsRecursiveWithCache(n);
    }

    public static int findMinCoinsDynamicApproach(int n) {
        return findMinCoinsRecursiveWithCache(n);
    }
}
