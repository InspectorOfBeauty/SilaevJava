package com.astondevs.silaev.trainee.tasks;

public class Task2 {
    // Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
    // если нет, то вывести "Нет такого имени"

    public static void checkingTheString(String name) {
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
