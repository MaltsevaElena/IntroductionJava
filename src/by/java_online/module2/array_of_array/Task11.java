package by.java_online.module2.array_of_array;

/*
 * Матрицу 10x20 заполнить случайными числами от 0 до 15.
 * Вывести на экран саму матрицу и номера строк,
 * в которых число 5 встречается 3 и более раз.
 */

public class Task11 {

    public static void main(String[] args) {
        int[][] matrix = new int[10][20];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.print("Число 5 встречается три и более раз в строках №");
        searchFive(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static void searchFive(int[][] array) {
        int count;

        for (int i = 0; i < array.length; i++) {
             count = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    count++;
                }
                if (count >= 3) {
                    System.out.print(i + 1 + ", ");
                    break;
                }
            }
        }
    }
}