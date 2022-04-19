package by.java_online.module2.array_of_array;

/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * A [I,J] = sin ((I^2-J^2)/N)
 * и подсчитать количество положительных элементов в ней.
 */
public class Task07 {

    public static void main(String[] args) {
        int n = 6;
        int count = 0;

        double[][] matrix = new double[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (matrix[i][j] > 0) {
                    count++;
                }
            }
        }

        printMatrix(matrix);
        System.out.println("Количество положительных элементов в матрице: " + count);
    }

    public static void printMatrix(double[][] arrays) {
        for (double[] array : arrays) {
            for (double v : array) {
                System.out.printf("%9.4f", v);
            }
            System.out.println();
        }
    }
}
