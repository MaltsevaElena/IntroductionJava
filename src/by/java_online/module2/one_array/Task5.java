package by.java_online.module2.one_array;

// Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {
    public static void main(String[] args) {
        int i;

        System.out.println("Даны целые числа: ");

        int[] array = {3, 7, 1, 9, 4, 15, 32};

        for (int h : array) {
            System.out.print(h + ", ");
        }
        System.out.println();

        i = 8;
        System.out.println("Числа больше " + i);

        for (int k : array) {
            if (k > i) {
                System.out.print(k + ", ");
            }
        }
    }
}
