package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// 1 + 3 = 4
// 4 + 5 = 9
// 9 + 7 = 16
// 16 + 9 = 25
class Task7Test {
    Task7 task7 = new Task7();

    @Test
    void positive_findSumOddNumberTest() {
        Assertions.assertEquals(25, task7.findSumOddNumber(1, 9));
    }
    @Test
    void negative_findSumOddNumberTest() {
        Assertions.assertNotEquals(25, task7.findSumOddNumber(1, 7));
    }
}