/*
    Проект. Часть 1.
    Напишите программу, которая конвертирует сумму денег из датских крон
    в российсие рубли по курсу покупки 13.82.
 */

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLE_PER_DKRONER = 13.82; // курс покупки датской кроны
        int dkk; // сумма денег в датских кронах
        double rub; // сумма денег в российских рублях

        Scanner into = new Scanner(System.in);

        // Получим сумму в кронах от пользователя
        System.out.println("Введите сумму денег в кронах: ");
        dkk = into.nextInt();

        // Вычисляем сумму в рублях
        rub = ROUBLE_PER_DKRONER * dkk;

        // Проверяем склонение и отображаем результат
        checkDeclination(dkk);
        System.out.println(" при переводе на рубли будет равна " + rub + ".");
    }

    /*
        Проект. Часть 2.
        Добавление в проект структуры выбора для принятия решений
        об окончаниях входной валюты в зависимости от её значений.
     */
    public static void checkDeclination(int kroner) {
        int digitOnes = kroner % 10; // цифра разряда единиц
        int digitTens = kroner % 100 / 10; // цифра разряда десятков

        if (digitOnes == 1 && digitTens != 1)
            System.out.print(kroner + " датская крона");
        else
            if ((digitOnes == 2 || digitOnes == 3 || digitOnes == 4) && digitTens != 1)
                System.out.print(kroner + " датские кроны");
            else
                System.out.print(kroner + " датских крон");

    }
}
