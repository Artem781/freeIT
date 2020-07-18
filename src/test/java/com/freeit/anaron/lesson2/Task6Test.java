package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    Task6 task6 = new Task6();

    @Test
    void firstLarger_findLargerNumberTest() {
        Assertions.assertEquals(3, task6.findLargerNumber(3, 2));
    }

    @Test
    void secondLarger_findLargerNumberTest() {
        Assertions.assertEquals(3, task6.findLargerNumber(2, 3));
    }
    @Test
    void sameNumber_findLargerNumberTest() {
        Assertions.assertEquals(2, task6.findLargerNumber(2, 2));
    }
}