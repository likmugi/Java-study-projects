import java.util.Scanner;

/*
    Задание №22. Раздел "Циклы".
    Напишите программу с интерактивным циклом проверки правильности ввода данных,
    считывающую пары целых чисел до тех пор, пока не встретит пару, в которой одно из чисел кратно другому.
 */
public class MultipleOfEachOverNumbers {
    public static void main(String[] args) {
        int firstValue, secondValue; // считываемые числа

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Введите первое число:");
            firstValue = input.nextInt();
            System.out.println("Введите второе число:");
            secondValue = input.nextInt();
        } while (firstValue % secondValue != 0 && secondValue % firstValue != 0);
    }
}
