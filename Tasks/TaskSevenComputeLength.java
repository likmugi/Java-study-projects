/*
    Задание №7. Раздел "Разработка простых Java-программ".

    Напишите программу, которая получает от пользователя радиус окружности,
    а вычисляет и отображает длину окружности.
    Используйте при написании программы соглашение по именованию,
    а также рекомендованный стиль программирования и документирования.
 */

import java.util.Scanner;

public class TaskSevenComputeLength {
    public static void main(String[] args) {
        final double PI = 3.14159; // константа Пи

        double radius; // радиус окружности
        double length; // длина окружности

        Scanner input = new Scanner(System.in);

        // Получаем от пользователя радиус окружности
        System.out.print("Введите радиус окружности: ");
        radius = input.nextDouble();

        // Вычисляем длину окружности
        length = 2 * PI * radius;

        // Отображаем результат
        System.out.println("Длина окружности: " + length);

    }
}
