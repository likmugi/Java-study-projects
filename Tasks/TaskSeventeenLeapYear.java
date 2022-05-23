/*
    Задание 17. Раздел "Типы данных и арифметические выражения".
    Напишите программу, которая определяет, является ли введенный год високосным или нет.
 */

import java.util.Scanner;

public class TaskSeventeenLeapYear {
    public static void main(String[] args) {
        short year; // год
        boolean isLeapYear; // является ли год високосным

        // Запрашиваем у пользователя год
        Scanner into = new Scanner(System.in);
        System.out.print("Введите год: ");
        year = into.nextShort();

        // Проверяем, является ли год високосным
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);

        // Отображаем результат
        if (isLeapYear)
            System.out.println(year + " - високосный год.");
        else
            System.out.println(year + " - не високосный год.");

    }
}
