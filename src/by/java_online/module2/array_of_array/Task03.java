package by.java_online.module2.array_of_array;

// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task03 {

    private static int k;
    private static int p;

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 5);
            }
        }

        System.out.println("Дана матрица:");
        printMatrix(matrix);

        k = (int) (Math.random() * 5);
        p = (int) (Math.random() * 5);

        System.out.println("Вывести " + k + "-ю строку и " + p + "-й столбец матрицы.");
        printResult(matrix);
    }

    public static void printMatrix(int[][] arrays) {
        for (int[] array : arrays) {
            for (int i : array) {
                System.out.printf("%3d\t", i);
            }
            System.out.println();
        }
    }

    public static void printResult(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (i == k - 1 || j == p - 1) {
                    System.out.printf("%3d\t", arrays[i][j]);
                } else System.out.print("    ");
            }
            System.out.println();
        }

    }
}

