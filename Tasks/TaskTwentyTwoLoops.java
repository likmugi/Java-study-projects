/*
    Задание №22. Раздел "Циклы".
 */

public class TaskTwentyTwoLoops {
    public static void main(String[] args) {
        exponentiationBaseTwo();
        getMultiplesOfFour();
        growthPopulation();
        multiplication();
        loopsExample();
    }

    // Метод, который отображает в консоли степень от 0 до 6 и результат возведения числа 2 в эту степень
    private static void exponentiationBaseTwo() {
        int n = 0;
        while (n <= 6) {
            System.out.println(n + " " + (int)Math.pow(2,n));
            n += 1;
        }
    }

    // Отобразить числа, кратные 4, от 0 до 100 включительно.
    private static void getMultiplesOfFour() {
        int multi4;

        for (multi4 = 0; multi4 <= 100; multi4 += 4) {
            if (multi4 == 0) continue;
            System.out.println(multi4);
        }
    }

    /*
        В городе, чье население с каждым годом растет на 10%, живет 9 870 человек.
        Напишите метод, который отображает ежегодную численность населения и определяет,
        через сколько лет (count_years) она будет превышать 30 000 человек.
     */
    private static void growthPopulation() {
        final double GROWTH = 0.1; // прирост населения в год
        final int finalValuePopulation = 30_000; // конечное значения для проверки численности населения
        int initialPpopulation = 9870; // начальное количество человек в городе

        int annualPopulation; // ежегодная численность населения
        int count_years; // количество лет прироста

        annualPopulation = initialPpopulation;
        for (count_years = 0; annualPopulation < finalValuePopulation; count_years++) {
            annualPopulation += annualPopulation * GROWTH;
        }

        System.out.println("Численность населения будет превышать " + finalValuePopulation + " через " + count_years + yearWordEnding(count_years) + " и будет равна " + annualPopulation);
    }

    // Метод возвращает строку с верным склонением слова
    private static String yearWordEnding(int years) {
        int digitOnes = years % 10; // цифра разряда единиц
        int digitTens = years % 100 / 10; // цифра разряда десятков

        if (digitOnes == 1 && digitTens != 1)
            return " год";
        else
            if ((digitOnes == 2 || digitOnes == 3 || digitOnes == 4) && digitTens != 1)
                return " года";
            else
                return " лет";
    }

    private static void multiplication() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i * j + "\t|\t");
            }
            System.out.println();
        }
    }

    public static void loopsExample() {
        loopFirst();
        loopSecond();
        loopThird();
        loopFourth();
        loopFifth(5);
        triangleFloyd(6);
    }

    private static void loopFirst() {
        System.out.println();
        for (int i = 1; i < 5; i++) {
            int j = 0;
            while (j < i) {
                System.out.print(j + " ");
                j++;
            }
        }
    }

    private static void loopSecond() {
        System.out.println('\n');
        int i = 0;
        while (i < 5) {
            for (int j = i; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            i++;
        }
    }

    private static void loopThird() {
        System.out.println();
        int i = 5;
        while (i >= 1) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }
            System.out.println();
            i--;
        }
    }
    private static void loopFourth() {
        System.out.println();
        int i = 1;
        do {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            i++;
        } while (i <= 5);
    }

    // Вывести треугольник из чисел, используя вложенные циклы
    private static void loopFifth(int n) {
        System.out.println();
        for (int i = 0; i <= n * 2; i++) {
            // до середины треугольника
            for (int j = 0; j <= i & i <= n; j++) {
                System.out.print(j + " ");
            }
            // после середины треугольника
            for (int j = 0; j <= (n * 2 - i) & i > n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Составить треугольник Флойда, кторый выглядит как набор чисел, увеличивающихся на 1
    private static void triangleFloyd(int n) {
        System.out.println();
        int num = 1;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column <= row; column++) {
                System.out.print(num++ + "\t");
            }
            System.out.println();
        }
    }
}
