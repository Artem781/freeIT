package com.freeit.anaron.lesson3;

//2)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
//Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
// часы:            3, 6, 9, 12, 15, 18, 21, 24
// колличесто амеб: 2  4  8  16  32  64  128 256
public class Task2 {
    public int findCountAmeba(int hour) {
        if (hour % 3 != 0) {
            return -1;
        }
        int amountAmeba = 1;
        for (int i = 3; i <= hour; i += 3) {
            amountAmeba = amountAmeba * 2;
        }
        return amountAmeba;
    }
}
