package com.freeit.anaron.lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FromMetodidchkaTask16Test {
    FromMetodidchkaTask16 task16 = new FromMetodidchkaTask16();

    @Test
    void findSumTest() {
        Assertions.assertEquals(5, task16.findSum(new int[]{1, 3, 2, 4}));
    }
    @Test
    void secondFindSumTest() {
        Assertions.assertEquals(0, task16.findSum(new int[]{7, 9, 2}));
    }
}