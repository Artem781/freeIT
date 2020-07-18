package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {
    Task5 task5 = new Task5();

    @Test
    void onePositive_findNumberTest() {
        Assertions.assertArrayEquals(new int[]{1, 2}, task5.findNumber(1, -6, -9));
    }

    @Test
    void twoPositive_findNumberTest() {
        Assertions.assertArrayEquals(new int[]{2, 1}, task5.findNumber(1, 6, -9));
    }

    @Test
    void threePositive_findNumberTest() {
        Assertions.assertArrayEquals(new int[]{3, 0}, task5.findNumber(1, 6, 9));
    }

    @Test
    void zeroPositive_findNumberTest() {
        Assertions.assertArrayEquals(new int[]{0, 3}, task5.findNumber(-1, -6, -9));
    }
}