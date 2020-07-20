package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FromMetodidchkaTask17Test {
    FromMetodidchkaTask17 task17 = new FromMetodidchkaTask17();
    int[][] createMatrixButterfly() {
        return new int[][]{
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
        };
    }

    @Test
    void firstArr_printButterflyTest() {
        Assertions.assertArrayEquals(createMatrixButterfly(), task17.printButterfly(new int[5][5]));
    }
}