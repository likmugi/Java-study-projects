/*
    Напишите программу, которая запрашивает у пользователя строку и отображает её в обратном порядке.
 */

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String s; // вводимая строка
        int len; // длина строки

        // Считаем строку
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");
        s = input.nextLine();

        // Инициализируем длину
        len = s.length() - 1;

        // Отобразим строку в обратном порядке
        System.out.print("Обратная строка равна ");
        while (len >= 0) {
            System.out.print(s.charAt(len));
            len--;
        }

    }
}
