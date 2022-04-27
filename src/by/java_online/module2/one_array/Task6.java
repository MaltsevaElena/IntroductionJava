package by.java_online.module2.one_array;

/* Задана последовательность N вещественных чисел.
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        double sum = 0;

        System.out.println("Дана последовательность вещественных чисел: ");
        double[] array = {3.6, 7.0, 1.5, 9.2, 4.8, 15.0, 32.99, 5.6, 10.1, 6.6, 7.4, 11.1};

        for (double h : array) {
            System.out.print(h + ", ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (primeNumber(i)) {
                sum += array[i];
            }
        }

        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами: " + sum);
    }

    public static boolean primeNumber(int x) {
        int temp;

        if (x < 2) return false;

        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
}
