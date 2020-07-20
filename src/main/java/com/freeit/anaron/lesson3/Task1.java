package com.freeit.anaron.lesson3;

//1)Начав тренировки, спортсмен в первый день пробежал 10 км.
//Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
//Какой суммарный путь пробежит спортсмен за 7 дней?
public class Task1 {
    public int findDistance(int allDay) {
        double kilometer = 10;
        int countDay = 1;

        while (countDay <= allDay) {
            countDay++;
            kilometer += kilometer * 10 / 100;
        }
        return (int) (kilometer);
    }
}
