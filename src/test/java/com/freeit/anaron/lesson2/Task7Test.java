package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task7Test {
    Task7 task7 = new Task7();

    @Test
    void first_correctEndingTest() {
        Assertions.assertEquals("programmera", task7.correctEnding(2));
    }

    @Test
    void second_correctEndingTest() {
        Assertions.assertEquals("programmera", task7.correctEnding(3));
    }

    @Test
    void thirst_correctEndingTest() {
        Assertions.assertEquals("programmera", task7.correctEnding(4));
    }

    @Test
    void fourth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(55));
    }

    @Test
    void fifth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(66));
    }

    @Test
    void sixth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(7));
    }

    @Test
    void seventh_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(888));
    }

    @Test
    void eighth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(9));
    }

    @Test
    void ninth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(100));
    }

    @Test
    void tenth_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(11));
    }

    @Test
    void eleventh_correctEndingTest() {
        Assertions.assertEquals("programmerov", task7.correctEnding(111));
    }

    @Test
    void twelfth_correctEndingTest() {
        Assertions.assertEquals("programmera", task7.correctEnding(23));
    }

    @Test
    void thirteenth_correctEndingTest() {
        Assertions.assertEquals("programmer", task7.correctEnding(1));
    }

    @Test
    void fourteen_correctEndingTest() {
        Assertions.assertEquals("programmer", task7.correctEnding(21));
    }

    @Test
    void fifteen_correctEndingTest() {
        Assertions.assertEquals("programmer", task7.correctEnding(331));
    }

    @Test
    void sixteen_correctEndingTest() {
        Assertions.assertEquals("programmer", task7.correctEnding(101));
    }

    @Test
    void seventeen_correctEndingTest() {
        Assertions.assertEquals("programmer", task7.correctEnding(100091));
    }
}