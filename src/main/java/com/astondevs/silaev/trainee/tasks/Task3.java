package com.astondevs.silaev.trainee.tasks;

public class Task3 {
    // Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

    public static void checkingTheArray(int[] array) {
        for (int i : array) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
