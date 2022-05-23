/*
    Задание №10. Раздел "Типы данных и арифметические выражения".
 */

import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args){
        arithmeticExpressions();
        getFahrenheit();
    }

    // Необходимо было переписать арифметические выражения на ЯП
    public static void arithmeticExpressions() {
        System.out.println("(4 / (3 * (r + 34))) - 9 * (a + b * c) + ((3 + d * (2 + a)) / (a + b * d))");
        System.out.println("5.5 * (r + 2.5) ^ (2.5 + t)");
        System.out.println("q = (k * A * (T1 - T2)) / L");
    }

    // Напишите программу, которая переводит температуру из градусов по шкале Цельсия в градусы по шкале Фаренгейта.
    public static void getFahrenheit() {
        double fahrenheit, celsius; // температура для обеих шкал

        Scanner scanner = new Scanner(System.in);

        // Получаем температуру от пользователя
        System.out.println("Введите градусы по шкале Цельсия: ");
        celsius = scanner.nextDouble();

        // Вычисляем градусы по шкале Фаренгейта по формуле
        fahrenheit = 9.0 / 5 * celsius + 32;

        // Отображаем результат
        System.out.println("По шкале Фаренгейта это будет: " + fahrenheit);
    }
}
