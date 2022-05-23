/*
    Задание 16. Раздел "Типы данных и арифметические выражения".
    Напишите программу, которая получает от пользователя вес в килограммах и рост в сантиметрах,
    а отображает и интерпретирует его BMI.
    (Доп.) Перепишите код таким образом, чтобы программа запрашивала у пользователя
    рост в метрах и сантимертах.
 */

import java.util.Scanner;

public class TaskSixteenBMI {
    public static void main(String[] args){
        improvedComputeAndInterpretBMI();
    }

    // Вариант с основной программой
    public static void ComputeAndInterpretBMI(){
        // Установочные индексы для интерпретации
        final float LOWER_LEVEL = 18.5f,
                MIDDLE_LEVEL = 25.0f,
                UPPER_LEVEL = 30.0f;
        final int SM_PER_METER = 100; // 1 м содержит 100 см

        float bmi;
        String interpretation;

        // Вес пользователя в кг и рост в см
        float weight, height;

        // Считываем входные данные
        Scanner into = new Scanner(System.in);
        System.out.println("Введите вес в килограммах и рост в сантимертах: ");
        weight = into.nextFloat();
        height = into.nextFloat();

        // Расчитаем BMI по формуле (переведя рост в см в м)
        bmi = weight/(float)Math.pow((height/SM_PER_METER), 2);

        if (bmi < LOWER_LEVEL)
            interpretation = "Недостаточный вес";
        else
        if (LOWER_LEVEL <= bmi & bmi < MIDDLE_LEVEL)
            interpretation = "Норма";
        else
        if (MIDDLE_LEVEL <= bmi & bmi < UPPER_LEVEL)
            interpretation = "Избыточный вес";
        else
            interpretation = "Ожирение";

        // Выводим результат
        System.out.println("Ваш BMI "+ bmi + " - у вас " + interpretation.toLowerCase());
    }

    // Дополнительное задание
    public static void improvedComputeAndInterpretBMI() {
        // Установочные индексы для интерпретации
        final float LOWER_LEVEL = 18.5f,
                MIDDLE_LEVEL = 25.0f,
                UPPER_LEVEL = 30.0f;
        final int SM_PER_METER = 100; // 1 м содержит 100 см

        float bmi;
        String interpretation;

        // Вес пользователя в кг и рост в см
        float weight, height, heightSM, heightM;

        // Считываем входные данные
        Scanner into = new Scanner(System.in);
        System.out.print("Введите вес в килограммах: ");
        weight = into.nextFloat();
        System.out.print("Введите рост в метрах: ");
        heightM = into.nextFloat();
        System.out.print("Введите вес в сантиметрах: ");
        heightSM = into.nextFloat();

        // Переведем рост в метры
        height = heightM + heightSM/SM_PER_METER;

        // Расчитаем BMI по формуле
        bmi = weight/(float)Math.pow((height), 2);

        if (bmi < LOWER_LEVEL)
            interpretation = "Недостаточный вес";
        else
        if (LOWER_LEVEL <= bmi & bmi < MIDDLE_LEVEL)
            interpretation = "Норма";
        else
        if (MIDDLE_LEVEL <= bmi & bmi < UPPER_LEVEL)
            interpretation = "Избыточный вес";
        else
            interpretation = "Ожирение";

        // Выводим результат
        System.out.println("Ваш BMI "+ bmi + " - у вас " + interpretation.toLowerCase());
    }
}
