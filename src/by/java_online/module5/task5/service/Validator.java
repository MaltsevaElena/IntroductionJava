package by.java_online.module5.task5.service;

public class Validator {

    public static boolean isFlowerInputValid(String name, int price) {

        return ("rose".equalsIgnoreCase(name) || "Chrysanthemum".equalsIgnoreCase(name)) && price > 0;
    }

    public static boolean isPackInputValid(String name, int price) {

        return ("paper".equalsIgnoreCase(name) || "BOX".equalsIgnoreCase(name)) && price > 0;
    }
}
