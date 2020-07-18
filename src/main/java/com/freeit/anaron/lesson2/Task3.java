package com.freeit.anaron.lesson2;

//3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
//Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на 10.
//Вывести полученное число
public class Task3 {
    public int actionOnNumber(int i) {
        if (i > 0) {
            i += 1;
        } else if (i < 0) {
            i -= 2;
        } else {
            i = 10;
        }
        return i;
    }
}
