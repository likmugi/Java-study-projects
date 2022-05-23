/*
    Задание 12. Раздел "Типы данных и арифметические выражения".
    Напишите программу, которая моделирует работу банкомата
    по выдаче введенной суммы денег наименьшим количеством рублевых купюр.
 */

import java.util.Scanner;

public class TaskTwelveBankTerminal {
    public static void main(String[] args) {

        int amount; // входные данные - сумма в рублях
        int countFiveThousandRoubles; // выходные данные - количество купюр по 5 тыс. руб.
        int countTwoThousandRoubles; // выходные данные - количество купюр по 2 тыс. руб.
        int countOneThousandRoubles; // выходные данные - количество купюр по 1 тыс. руб.
        int countFiveHundredRoubles; // выходные данные - количество купюр по 5 сотен руб.
        int countTwoHundredRoubles; // выходные данные - количество купюр по 2 сотни руб.
        int countOneHundredRoubles; // выходные данные - количество купюр по 1 сотне руб.
        int countHalfHundredRoubles; // выходные данные - количество купюр по 5 десятков руб.

        Scanner scanner = new Scanner(System.in);

        // Получаем сумму в рублях от пользователя
        System.out.print("Введите сумму в рублях, кратную 50: ");
        amount = scanner.nextInt();

        // Вычислить количество купюр по 5_000
        countFiveThousandRoubles = amount / 5000;
        amount %=  5000;

        // Вычислить количество купюр по 2_000
        countTwoThousandRoubles = amount / 2000;
        amount %= 2000;

        // Вычислить количество купюр по 1_000
        countOneThousandRoubles = amount / 1000;
        amount %= 1000;

        // Вычислить количество купюр по 500
        countFiveHundredRoubles = amount / 500;
        amount %= 500;

        // Вычислить количество купюр по 200
        countTwoHundredRoubles = amount / 200;
        amount %= 200;

        // Вычислить количество купюр по 100
        countOneHundredRoubles = amount / 100;
        amount %= 100;

        // Вычислить количество купюр по 50
        countHalfHundredRoubles = amount / 50;

        // Отобразим результат
        System.out.println("Ваша сумма состоит из");
        System.out.println("    " + countFiveThousandRoubles + " шт. 5-тыс. руб. купюр,");
        System.out.println("    " + countTwoThousandRoubles + " шт. 2-тыс. руб. купюр,");
        System.out.println("    " + countOneThousandRoubles + " шт. 1-тыс. руб. купюр,");
        System.out.println("    " + countFiveHundredRoubles + " шт. 500-руб. купюр,");
        System.out.println("    " + countTwoHundredRoubles + " шт. 200-руб. купюр,");
        System.out.println("    " + countOneHundredRoubles + " шт. 100-руб. купюр,");
        System.out.println("    " + countHalfHundredRoubles+ " шт. 50-руб. купюр.");
    }
}
