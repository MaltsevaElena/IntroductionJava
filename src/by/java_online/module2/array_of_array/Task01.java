package by.java_online.module2.array_of_array;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task01 {

    public static void main(String[] args) {

        int[][] matrix = new int[4][15];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        System.out.println("Вывести на экран все нечетные столбцы," +
                " у которых первый элемент больше последнего.");
        printOddColumn(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static void printOddColumn(int[][] arrays) {
        for (int[] array : arrays) {
            for (int j = 0; j < array.length; j += 2) {
                if (arrays[0][j] > arrays[arrays.length - 1][j]) {
                    System.out.printf("%3d\t", array[j]);
                }
            }
            System.out.println();
        }
    }
}
