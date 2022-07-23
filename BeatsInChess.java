/*
    Требуется определить, бьет ли выбранная фигура, стоящая на клетке с указанными координатами (номер строки
    и номер столбца), фигуру, стоящую на другой указанной клетке.

    Примечание: вводятся четыре числа: координаты ферзь (два числа) и координаты другой фигуры (два числа),
    каждое число вводится в отдельной строке. Координаты - целые числа в интервале от 1 до 8.
 */

import java.util.Scanner;

public class BeatsInChess {
    public static void main(String[] args) {
        int x1, y1, x2, y2; // координаты двух фигур
        String chessPiece; // наименование фигуры, которая бьет

        Scanner sc = new Scanner(System.in);

        do {
            // Получим координаты наших фигур
            System.out.println("Введите 4 координаты через пробел. Первые две координаты для фигуры, которая бьет " +
                    "и вторые - для той, которую планируют бить.");

            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            // Получим от пользователя информацию, какой фигурой мы ходим
            System.out.println("Выбери фигуру, которая стоит на позиции (x1,y1): ладья, слон, конь или ферзь.");
            // перед считыванием уберем символ переноса строки после метода nextInt()
            sc.nextLine();
            chessPiece = sc.nextLine();

            // Определим, бьет ли выбранная фигура ту, что стоит на позиции (x2, y2)
            chooseChessPiece(chessPiece, x1, y1, x2, y2);

            // Проверим, желает ли пользователь продолжить
            System.out.println("Если хотите продолжить, нажмити Enter. Для завершения введите \"выход\".");

        } while (!sc.nextLine().equals("выход"));

        System.out.println("\nРабота завершена...");
    }

    // На основе введенной пользователем фигуры, вызываем соответствующий метод
    public static void chooseChessPiece (String chess, int x1, int y1, int x2, int y2) {
        switch (chess.toLowerCase()) {
            case "ладья" ->
                    System.out.println(isRookBeats(x1, y1, x2, y2) ? "Ладья бьет вашу фигуру!" : "Ладья не может бить.");
            case "слон" ->
                    System.out.println(isBishopBeats(x1, y1, x2, y2) ? "Слон бьет вашу фигуру!" : "Слон не может бить.");
            case "конь" ->
                    System.out.println(isKnightBeats(x1, y1, x2, y2) ? "Конь бьет вашу фигуру!" : "Конь не может бить.");
            case "ферзь" ->
                    System.out.println(isQueenBeats(x1, y1, x2, y2) ? "Ферзь бьет вашу фигуру!" : "Ферзь не может бить.");
        }
    }

    public static boolean isRookBeats(int x1, int y1, int x2, int y2) {
        return (x1 == x2) || (y1 == y2);
    }

    public static boolean isBishopBeats(int x1, int y1, int x2, int y2) {
        return Math.abs(x1-x2) == Math.abs(y1-y2);
    }

    public static boolean isKnightBeats(int x1, int y1, int x2, int y2) {
        int s1 = Math.abs(x1-x2);
        int s2 = Math.abs(y1-y2);
        return (s1==1 && s2==2) || (s1==2 && s2==1);
    }

    public static boolean isQueenBeats(int x1, int y1, int x2, int y2) {
        return isBishopBeats(x1, y1, x2, y2) || isRookBeats(x1, y1, x2, y2);
    }
}
