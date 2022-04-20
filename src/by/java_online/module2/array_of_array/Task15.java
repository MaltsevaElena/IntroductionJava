package by.java_online.module2.array_of_array;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

    private static int max = 0;

    public static void main(String[] args) {
        int m = 7;
        int n = 5;

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Дана матрица Матрица: ");
        printMatrix(matrix);

        System.out.println("Элемент с наибольшим значением равен " + max);
        System.out.println("Заменить все нечетные элементы матрицы этим числом:");
        replacementElement(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static void replacementElement(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 1) {
                    array[i][j] = max;
                }
            }
        }
        printMatrix(array);
    }
}
