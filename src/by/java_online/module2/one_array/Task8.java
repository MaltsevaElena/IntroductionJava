package by.java_online.module2.one_array;

/* Дана последовательность целых чисел a1, a2,..., an.
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1, a2,..., an).
 */

public class Task8 {
    public static void main(String[] args) {
        int[] array = {5, 8, 2, 5, 1, 9, 3, 1, 4, 99, 34, 1};
        System.out.println("Дана последовательность целых чисел: ");
        printArray(array);

        System.out.println("Новая последовательность: ");
        printArray(deleteMinElement(array));

    }

    public static void printArray(int[] ar) {
        for (int j : ar) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    public static int[] deleteMinElement(int[] arrays) {
        int minCount = 0;
        int min = arrays[0];
        int index = 0;

        for (int i = 1; i < arrays.length; i++) { //находим мин число
            if (min > arrays[i]) {
                min = arrays[i];
            }
        }
        for (int value : arrays) { // находим кол-во мин чисел
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[arrays.length - minCount];

        for (int array : arrays) {
            if (array != min) {
                result[index] = array;
                index++;
            }
        }
        return result;
    }
}
