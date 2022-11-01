package hens.fabric;

import hens.*;

import java.util.Random;
/*Написать фабрику по производству кур(Hen)
Создать класс Hen
1.1. Сделать его абстрактным
1.2. Добавить в класс абстрактный метод  int getCountOfEggsPerMonth()
1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я курица."

2. Создать класс RussianHen, который наследуется от Hen
3. Создать класс UkrainianHen, который наследуется от Hen
4. Создать класс MoldovanHen, который наследуется от Hen
5. Создать класс BelarusianHen, который наследуется от Hen

6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth. \
Методы должны возвращать количество яиц в месяц от данного типа куриц.

7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
Методы должны возвращать строку вида:
getDescription() родительского класса  + " Моя страна - SSSSS. Я несу N яиц в месяц."
где SSSSS - название страны где N - количество яиц в месяц 8.

В Main создать 100 кур разных парод(случайное количество),
 вывести описание каждой пароды и посчитать общее количество снесённых яиц за год.*/
public class HensFabric {
    public static void main(String[] args) {
        Hen[] hens = new Hen[100];
        Random random = new Random();

        int sumOfEggs = 0;
        for (int i = 0; i < hens.length; i++) {
            int code = random.nextInt(4);
            switch (code) {
                case 0 -> hens[i] = new BelarusianHen();
                case 1 -> hens[i] = new MoldovaHen();
                case 2 -> hens[i] = new RussianHen();
                case 3 -> hens[i] = new UkrainianHen();
            }
            sumOfEggs += hens[i].getCountOfEggsPerMonth();
        }

        System.out.println(new BelarusianHen().getDescription());
        System.out.println(new UkrainianHen().getDescription());
        System.out.println(new MoldovaHen().getDescription());
        System.out.println(new RussianHen().getDescription());

        System.out.println(sumOfEggs);

    }
}
