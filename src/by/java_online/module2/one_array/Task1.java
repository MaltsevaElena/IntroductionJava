package by.java_online.module2.one_array;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        int k = 5;
        int sum = 0;

        int[] array = {3, 5, 8, 10, 13, 15};

        for (int j : array) {
            if (j % k == 0) {
                sum += j;
            }
        }

        System.out.println("Сумма элементов, кратных K = " + k + ": " + sum);
    }
}
