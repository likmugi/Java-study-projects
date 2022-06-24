import java.util.Scanner;
/*
    Задание №22. Раздел "Циклы".
    Напишите программу, которая вычисляет 1 + 2 + 3 + ... + (n - 1) + n, где n — исходное значение.
    Добавьте после тела цикла предложение if, которое сравнивает полученное значение с (n * (n + 1)) / 2
    и отображает сообщение, указывающее, являются ли эти значения одинаковыми или разными.
 */
public class TaskTwentyTwoCalculation {
    public static void main(String[] args) {
        int targetValueN; // исходное значение
        int currentValue; // текущее число

        int resultExpression; // результат вычисления
        int comprasionValue; // результат для сравнения

        Scanner input = new Scanner(System.in);

        // Получаем исходное значение
        targetValueN = getTargetValue(input);

        currentValue = 1;
        resultExpression = 0;

        // Вычисляем выражение
        while (currentValue <= targetValueN) {
            resultExpression += currentValue;
            ++currentValue;
        }

        // Вычисляем выражение для сравнения
        comprasionValue = (targetValueN * (targetValueN + 1)) / 2;

        System.out.println('\n' + "Результат вычисления: " + resultExpression +
                           '\n' + "Результат для сравнения: " + comprasionValue + '\n');

        // Сравниваем значения
        if (resultExpression == comprasionValue) {
            System.out.println("Полученные значения одинаковы.");
        }
        else System.out.println("Полученные значения различны.");


    }
    private static int getTargetValue(Scanner input) {
        System.out.println("Введите исходное значение: ");
        return input.nextInt();
    }
}
