/*
    Задание №20. Раздел "Математические функции, символы и строки".
    Задания по символьному типу данных.

 */
public class TaskTwenty {
    public static void main(String[] args) {
        taskTwentyDotOne();
        taskTwentyDotTwo();
    }

    static void taskTwentyDotOne() {
        /*
            Напишите предложения для вывода кодов ASCII,
            соответствующих символам '1', 'A', 'B', 'a' и 'b'.
         */
        getCharacterCode('1');
        getCharacterCode('A');
        getCharacterCode('B');
        getCharacterCode('a');
        getCharacterCode('b');

        /*
            Необходимо вывести символы,
            соответствующие десятичным кодам 40, 59, 79, 85 и 90.
         */
        getCharacterByCode(40);
        getCharacterByCode(59);
        getCharacterByCode(79);
        getCharacterByCode(85);
        getCharacterByCode(90);

        /*
            Напишите предложения для вывода символов,
            соответствующих шестнадцатеричным кодам 40, 5A, 71, 72 и 7A.
         */
        getCharacterByHex("40");
        getCharacterByHex("5A");
        getCharacterByHex("71");
        getCharacterByHex("72");
        getCharacterByHex("7A");
    }

    // Напишите программу, которая генерирует и отображает случайную строчную латинскую букву
    static void taskTwentyDotTwo() {
        System.out.println("Случайная латинская буква: " + (char)randomizer((int)'a', (int)'z'));
    }

    // Напишем отдельный метод для вывода кода ASCII по символу
    private static void getCharacterCode(char symbol) {
        System.out.println("Символу " + symbol + " соответсвует код " + (int)symbol);
    }

    // Напишем отдельный метод для вывода символа уникода по коду
    private static void getCharacterByCode(int i) {
        System.out.println("Код " + i + " соответсвует символу " + (char)i);
    }

    // Напишем метод вывода символа по hex-кодам
    private static void getCharacterByHex(String hexString) {
        int hex = Integer.parseInt(hexString, 16);
        System.out.println("Шестнадцатеричный код " + hexString + " соответсвует символу " + hex);
    }

    // Вывод случайного числа в промежутке от a до b
    private static int randomizer(int a, int b){
        b -= a + 1; // включая правую границу
        return a + (int)(Math.random() * b);
    }
}
