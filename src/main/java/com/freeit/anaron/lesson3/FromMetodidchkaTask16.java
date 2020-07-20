package com.freeit.anaron.lesson3;

//Определите сумму элементов одномерного массива, расположенных между
// минимальным и максимальным значениями.
public class FromMetodidchkaTask16 {
    public int findSum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxPosition = arr.length;
        int min = Integer.MAX_VALUE;
        int minPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        int start;
        int end;
        if (minPosition < maxPosition) {
            start = minPosition;
            end = maxPosition;
        } else {
            start = maxPosition;
            end = minPosition;
        }
        int sum = 0;
        for (int i = start + 1; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
