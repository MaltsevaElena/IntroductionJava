package by.java_online.module3.string_array;

//Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        String string;
        String letter;

        string = "In the beginning was the word. Then word, word, word ...";
        System.out.println("Дана строка: " + string);

        System.out.println("Замените в строке все  'word' на 'letter'.");
        letter = string.replace("word", "letter");

        System.out.println(letter);
    }
}
