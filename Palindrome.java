/*
    Напишите программу, которая запрашивает у пользователя строку и отображает, является ли она палиндромом.
 */

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String s; // вводимая строка

        int low; // индекс начала строки
        int high; // индекс конца строки
        boolean isPalindrome; // является ли палиндромом

        // Получаем строку
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку без пробелов: ");
        s = input.nextLine();

        // Инициализируем индексы
        low = 0;
        high = s.length() - 1;

        // Проверяем строку
        isPalindrome = true; // Предположим, что это верно
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }

        // Отобразим, является ли строка палиндромом
        if (isPalindrome) System.out.println(s + " является палиндромом.");
        else System.out.println(s + " не является палиндромом.");

    }
}
