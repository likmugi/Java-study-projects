/*
    Задание №22. Раздел "Циклы".
 */

public class TaskTwentyTwoLoops {
    public static void main(String[] args) {
        exponentiationBaseTwo();
        getMultiplesOfFour();
        growthPopulation();
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

}
