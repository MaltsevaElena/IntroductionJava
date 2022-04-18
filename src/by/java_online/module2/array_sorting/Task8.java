package by.java_online.module2.array_sorting;

/*
 * Даны дроби p1/q1, p2/q2,... ,pn/qn (pi, qi - натуральные).
 * Составить программу, которая приводит эти дроби к общему
 * знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {

    public static void main(String[] args) {
        int nod;

        Fraction[] fractions = new Fraction[6];
        for (int i = 0; i < fractions.length; i++) {
            fractions[i] = new Fraction((int) (Math.random() * 8) + 1, (int) (Math.random() * 8 + 1));
        }

        System.out.println("Даны дроби: ");
        printArray(fractions);

        nod = commonDenominator(fractions);

        System.out.println("Общий знаменатель: " + nod);
        numerator(fractions, nod);
        sortArray(fractions);

        System.out.println("Привести дроби к общему знаменателю, и упорядочить в порядке возрастания:");
        printArray(fractions);

    }

    public static int commonDenominator(Fraction[] arr) {
        // Находим общий знаменатель
        int denominator = 1;
        for (Fraction fraction : arr) {
            denominator = nok(denominator, fraction.denominator);
        }
        return denominator;
    }

    public static int nod(int a, int b) {
        return b == 0 ? a : nod(b, a % b);
    }

    public static int nok(int a, int b) {
        return a / nod(a, b) * b;
    }

    public static void numerator(Fraction[] fr, int nod) {
        //приводим числители к общему знаменателю
        for (Fraction fraction : fr) {
            fraction.numerator = nod / fraction.denominator * fraction.numerator;
            fraction.denominator = nod;
        }
    }

    public static void sortArray(Fraction[] fraction) {
        int tmp;
        for (int i = 0; i < fraction.length - 1; i++) {
            for (int j = fraction.length - 1; j > i; j--) {
                if (fraction[j - 1].numerator > fraction[j].numerator) {
                    tmp = fraction[j - 1].numerator;
                    fraction[j - 1].numerator = fraction[j].numerator;
                    fraction[j].numerator = tmp;
                }
            }
        }
    }

    public static void printArray(Fraction[] arr) {
        for (Fraction fraction : arr) {
            System.out.printf("%2d/%d\t", fraction.numerator, fraction.denominator);
        }
        System.out.println();
    }
}

class Fraction {
    public int numerator;
    public int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
}

