package by.java_online.module1.cycle;

//Даны два числа. Определить цифры, входящие в запись как первого, так и второго числа.

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        int one;
        int two;
        int b;

        one = 145728;
        two = 834753;

        ArrayList<Integer> valueElementsOne = new ArrayList<>();
        ArrayList<Integer> valueElementsTwo = new ArrayList<>();

        for (int i = one; i > 0; i /= 10) { //разбиваем число на отдельные числа
            b = i % 10;
            valueElementsOne.add(b);
        }
        for (int y = two; y > 0; y /= 10) {
            b = y % 10;
            valueElementsTwo.add(b);
        }

        System.out.print("Цифры, входящие в запись как первого так и второго числа: ");

        for (int elementOne : valueElementsOne) { //проверяем числа на совпадения
            for (int elementTwo : valueElementsTwo) {
                if (elementOne == elementTwo) {
                    System.out.print(elementOne + " ");
                    break;
                }
            }
        }
    }
}
