/*
    Проект. Часть 1.
    Напишите программу, которая конвертирует сумму денег из датских крон
    в российсие рубли по курсу покупки 13.82.
 */

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        final double ROUBLE_PER_DKRONE = 13.82; // курс покупки датской кроны
        int dkk; // сумма денег в датских кронах
        double rub; // сумма денег в российских рублях

        Scanner into = new Scanner(System.in);

        // Получим сумму в кронах от пользователя
        System.out.println("Введите сумму денег в кронах: ");
        dkk = into.nextInt();

        // Вычисляем сумму в рублях
        rub = ROUBLE_PER_DKRONE * dkk;

        // Отображаем результат:
        System.out.println("При переводе на рубли вы получите сумму: " + rub);
    }
}
