package com.freeit.anaron.lesson2;

//5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
public class Task5 {
    public int[] findNumber(int a, int b, int c) {
        int positive = 0;
        int negative = 0;
        if (a > 0) {
            positive++;
        } else if (a < 0) {
            negative++;
        }
        if (b > 0) {
            positive++;
        } else if (b < 0) {
            negative++;
        }
        if (c > 0) {
            positive++;
        } else if (c < 0) {
            negative++;
        }
        int[] intArr = new int[2];
        intArr[0] = positive;
        intArr[1] = negative;
        return intArr;
    }
}
