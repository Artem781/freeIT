package com.freeit.anaron.lesson2;

//7)  В переменную записываете количество программистов.
//В зависимости от количества программистов необходимо вывести правильное окончание.
//Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
public class Task7 {
    public String correctEnding(int count) {
        String programmer = "programmer";
        char a = 'a';
        String ov = "ov";
        int lastNumber = count % 10;
        if (lastNumber == 2 | lastNumber == 3 | lastNumber == 4) {
            return programmer + a;
        } else if (lastNumber == 5 | lastNumber == 6 | lastNumber == 7
                | lastNumber == 8 | lastNumber == 9 | lastNumber == 0 | count % 100 == 11) {
            return programmer + ov;
        } else {
            return programmer;
        }
    }
}
