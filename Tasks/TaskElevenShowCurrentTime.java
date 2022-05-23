/*
    Задание №11. Раздел "Типы данных и арифметические выражения".

    Перепишите программу ShowCurrentTime таким образом, чтобы она отображала текущее время для вашего региона.
    Убедитесь, что вы добавили для этого соответствующую константу, и попробуйте «за столом» проверить правильность
    работы вашего алгоритма для вечерних часов, таких, как 21–23 часа,
    или сразу запускайте готовую программу в это же время.
 */

public class TaskElevenShowCurrentTime {
    public static void main(String[] args) {
        final int MILLISECONDS_PER_SECOND = 1000,
                  SECONDS_PER_MINUTE = 60,
                  MINUTES_PER_HOUR = 60,
                  HOURS_PER_DAY = 24,
                  GTM_PER_MSK = 3; // Время в GMT на 3 часа отстает от времени в MSK

        long totalMilliseconds,
             totalSeconds,
             totalMinute,
             totalHour,
             currentSecond,
             currentMinute,
             currentHour;

        // Получим общее кол-во миллисекунд
        totalMilliseconds = System.currentTimeMillis();

        // Вычисляем общее кол-во секунд с Unix эпохи
        totalSeconds = totalMilliseconds / MILLISECONDS_PER_SECOND;

        // Вычисляем текущее кол-во секунд
        currentSecond = totalSeconds % SECONDS_PER_MINUTE;

        // Вычисляем общее кол-во минут с Unix эпохи
        totalMinute = totalSeconds / SECONDS_PER_MINUTE;

        // Вычисляем текущее кол-во минут
        currentMinute = totalMinute % MINUTES_PER_HOUR;

        // Вычисляем общее кол-во часов с Unix эпохи
        totalHour = totalMinute / MINUTES_PER_HOUR;

        // Вычисляем текущее кол-во часов в MSK
        currentHour = (totalHour + GTM_PER_MSK) % HOURS_PER_DAY;

        // Отобразить текущее время
        System.out.println("Текущее время равно " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " MSK.");
    }
}
