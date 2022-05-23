/*
    Задание 13. Раздел "Типы данных и арифметические выражения".

    Напишите программу, которая вычисляет стоимость проезда в такси
    в зависимости от расстояния из расчета 8 руб. 50 коп. за километр.
    Ваша программа должна взаимодействовать с пользователем следующим образом:

        СЧЕТЧИК СТОИМОСТИ ПРОЕЗДА
        Введите начальные показания одометра: 13505
        Введите конечные показания одометра: 13810
        Вы проехали 305 км. Из расчета 8 руб. 50 коп. за км,
        стоимость проезда равна 2592 руб. 50 коп.
 */

import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        final int RUB_PER_KM = 8; // часть цены за км в рублях
        final int KOPECKS_PER_KM = 50; // часть цены за кк в копейках
        final byte KOPECKS_TO_RUB = 100; // копеек содержится в рубле

        int initialIndications, finalIndications; // получаемые показания одометра
        int differenceBetween; // разница в показаниях
        double totalKopecks; // полная стоимость в копейках
        int currentPriceRub, currentPriceKopecks; // стоимость в рублях и копейках

        Scanner into = new Scanner(System.in);

        // Получаем показания одометра от пользователя
        System.out.println("СЧЕТЧИК СТОИМОСТЬ ПРОЕЗДА");
        System.out.print("Введите начальные показания одометра: ");
        initialIndications = into.nextInt();
        System.out.print("Введите конечные показания одометра: ");
        finalIndications = into.nextInt();

        // Вычисляем разницу в показаниях и стоимость проезда
        differenceBetween = finalIndications - initialIndications;
        // Находим стоимость в рублях за км
        currentPriceRub = differenceBetween * RUB_PER_KM;
        // Находим стоимость полную стоимость в копейках
        totalKopecks = differenceBetween * KOPECKS_PER_KM;
        // Добавляем к стоимости копейки, переведенные в рубли
        currentPriceRub += totalKopecks / KOPECKS_TO_RUB;
        // Находим оставшиеся от перевода в рубли копейки
        currentPriceKopecks = (int)(totalKopecks % KOPECKS_TO_RUB);

        // Отображаем результат вычислений
        System.out.println("Вы проехали " + differenceBetween + " км. " +
                "Из расчета " + RUB_PER_KM + " руб. " + KOPECKS_PER_KM +
                " коп. за км, \nстоимость проезда равна " +
                currentPriceRub + " руб. " + currentPriceKopecks + " коп.");

    }
}
