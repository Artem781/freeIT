package com.freeit.anaron.lesson2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 task2 = new Task2();

    @Test
    void positive_doesExistTriangleTest() {
        assertTrue(task2.doesExistTriangle(5, 6, 7));
    }

    @Test
    void negative_doesExistTriangleTest() {
        assertFalse(task2.doesExistTriangle(13, 6, 7));
    }
}