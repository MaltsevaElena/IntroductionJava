package by.java_online.module2.array_sorting;
/*
 * Сортировка выбором.
 * Дана последовательность чисел: a1, a2,..., an.
 * Требуется переставить элементы так, чтобы они были расположены по убыванию.
 * Для этого в массиве, начиная с первого, выбирается наибольший элемент и
 * ставится на первое место, а первый - на место наибольшего.
 * Затем, начиная со второго, эта процедура повторяется.
 * Написать алгоритм сортировки выбором.
 */

public class Task3 {

    public static void main(String[] args) {

        int[] array = {4, 6, 23, 65, 1, 43, 8, 66, 92, 5, 2};

        System.out.println("Дана последовательность: ");
        printArray(array);

        System.out.println("Отсортировать по убыванию, сортировка Выбора: ");
        sortArray(array);
        printArray(array);
    }

    public static void sortArray(int[] arrays) {
        int max;
        int index;

        for (int i = 0; i < arrays.length; i++) {
            max = arrays[i];
            index = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] > max) {
                    max = arrays[j];
                    index = j;
                }
            }
            arrays[index] = arrays[i];
            arrays[i] = max;
        }
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%2d\t", i);
        }
        System.out.println();
    }
}
