import java.util.Scanner;
/*
    Задание №22. Раздел "Циклы".
    Программа запрашивает у пользователя числовые значения, а выводит количество положительных
    и количество отрицательных введенных значений.
 */


public class CountPositiveAndNegativeVal {
    public static void main(String[] args) {
        final int SENTINEL = 0; // сигнальная метка
        int value;

        int countPositiveNumbers = 0;
        int countNegativeNumbers = 0;

        Scanner input = new Scanner(System.in);
        // считываем первое значение
        System.out.println("Введите число или 0 для выхода:");
        value = input.nextInt();

        while (value != SENTINEL) {
            if (value > 0)
                countPositiveNumbers++;
            else
                countNegativeNumbers++;
            // считываем следующее значения
            System.out.println("Введите число или 0 для выхода:");
            value = input.nextInt();
        }

        // Выводим результат
        System.out.println("Среди ваших чисел было " +
                countPositiveNumbers + " положительных и " +
                countNegativeNumbers + " отрицательных.");
    }
}
