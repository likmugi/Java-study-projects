import java.util.Scanner;
/*
    Задание №22. Раздел "Циклы".
    Напишите программу, которая вычисляет и отображает зарплату каждого сотрудника, а также общую зарплату компании,
    исходя из отработанного каждым сотрудником времени в часах и часовой ставки в рублях.
 */
public class TaskTwentyTwoSalaryCalculation {
    public static void main(String[] args) {
        int number_emp; // кол-во сотрудников
        double hours; // отработанные часы
        double rate; // часовая ставка в рублях

        int count_emp; // текущий сотрудник

        double pay; // зарплата текущего сотрудника в рублях
        double total_pay; // общая зарплата компании

        Scanner into = new Scanner(System.in);

        // Получим количество сотрудников компании
        number_emp = getEmp(into);

        // Получение информации о сотрудниках
        count_emp = 0;
        total_pay = 0.0;
        while (count_emp < number_emp) {
            // Получить отработанные часы и часовую ставку для текущего сотрудника
            hours = getHours(into);
            rate = getRate(into);

            // Вычислить и отобразить зарплату текущего сотрудника в рублях
            pay = hours * rate;
            System.out.println("Зарплата сотрудника равна " + pay + " руб.");

            // Прибавить зарплату текущего сотрудника к общей зарплате компании
            total_pay += pay;

            /// Перейти к следующему сотруднику
            ++count_emp;
        }

        System.out.println('\n' + "Все сотрудники обработаны" + '\n');

        // Отобразить общую зарплату компании в рублях
        System.out.println("Общая зарплата компании равна " + total_pay + " руб.");


    }

    private static int getEmp(Scanner into) {
        System.out.println("Введите количество сотрудников в компании:");
        return into.nextInt();
    }

    private static double getHours(Scanner into) {
        System.out.println("Введите отработанные часы:");
        return into.nextDouble();
    }

    private static double getRate(Scanner into) {
        System.out.println("Введите часовую ставку в рублях:");
        return into.nextDouble();
    }

}
