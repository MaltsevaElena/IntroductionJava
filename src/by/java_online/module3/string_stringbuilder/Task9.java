package by.java_online.module3.string_stringbuilder;
/* Посчитать количество строчных (маленьких) и прописных (больших) букв во введенной строке.
 * Учитывать только английские буквы.
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        String string;
        int lowerCase;
        int upperCase;

        string = enterToConsole("Введите строку на Английском.");

        lowerCase = lowerCase(string);
        upperCase = upperCase(string);

        System.out.println("Количество строчных букв в введенной строке равно " + lowerCase +
                " и количество прописных букв равно " + upperCase);
    }

    public static String enterToConsole(String message) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println(message);

        return sc.nextLine();
    }

    public static int lowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;
    }

    public static int upperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
