package com.freeit.anaron.lesson3;
//Создать двухмерный квадратный массив, и заполнить его «бабочкой»
public class FromMetodidchkaTask17 {
    public int[][] printButterfly(int[][] arr) {
        int count = 0;
        int pointLine = 0;
        int length = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < length - (i + count); j++) {
                arr[i][j + pointLine] = 1;
            }
            if ((arr.length / 2) > i) {
                pointLine++;
                count++;
            } else {
                pointLine--;
                count = count - 3;
            }
        }
        return arr;
    }
}
