import java.time.LocalDate;
import java.util.Scanner;

/*
    Написать программу, которая вычисляет ежемесячные проценты по вкладу (без капитализации),
    исходя из введенных пользователем месяца и года открытия вклада, срока вклада в месяцах,
    годовой процентной ставки и суммы вклада в рублях. Пусть количество дней в году будет всегда равно 365,
    т.е. високосные года в вычислениях не учитываются.
 */
public class DepositCalculation {
    // Объявим константы
    static final int MONTHS_OF_YEAR = 12; // месяцев в году
    static final int DAYS_YEAR = 365; // дней в году

    public static void main(String[] args) {
        int startMonth; // номер месяца открытия вклада
        int startYear; // год открытия вклада
        int depositTerm; // срок вклада в месяцах
        double rate; // процентная ставка (% годовых)
        double depositAmount; // сумма вклада
        double accruedInterestPerMonth; // доход по вкладу в текущем месяце
        double accruedInterestTotal = 0; // суммарный доход по вкладу

        Scanner input = new Scanner(System.in);
        // Получить номер месяц открытия вклада
        System.out.print("Введите номер месяца открытия вклада: ");
        startMonth = input.nextInt();

        // Получить год открытия вклада
        System.out.print("Введите год открытия вклада: ");
        startYear = input.nextInt();

        // Получить срок вклада в месяцах
        System.out.print("Введите срок вклада в месяцах: ");
        depositTerm = input.nextInt();

        // Получить сумму вклада
        System.out.print("Введите сумму вклада: ");
        depositAmount = input.nextDouble();

        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку: ");
        rate = input.nextDouble();

        int monthsCount = 0; // счетчик месяцев

        int i = startYear;
        while (monthsCount < depositTerm) {
            // Исключаем месяц открытия вклада
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) {
                if (i == startYear && j <= startMonth) {
                    continue;
                }

                // Выходим из расчета, если достигли конца срока вклада
                if (monthsCount == depositTerm) {
                    break;
                }

                // Получаем количество дней в текущем месяце
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();

                // Рассчитаем доход по вкладу в текущем месяце и округлим его до копеек
                accruedInterestPerMonth = depositAmount * rate / 100 / DAYS_YEAR * lengthOfMonth;
                accruedInterestPerMonth = Math.round(accruedInterestPerMonth * 100) / 100.0;

                // Отображаем результат начисленных в этом месяце процентов
                System.out.println("Начислено процентов в " + i + " году " + j + " месяца = " + accruedInterestPerMonth);

                // Добавим процент по вкладам текущего месяца к суммарной выплате
                accruedInterestTotal += accruedInterestPerMonth;

                monthsCount++; // Увеличим счетчик на 1, так как завершаем с ним работу

            }

            i++; // Увеличим год на 1
        }

        // Выводим итоговый результат начисленных процентов
        System.out.println("Всего начислено процентов = " + accruedInterestTotal);


    }
}
