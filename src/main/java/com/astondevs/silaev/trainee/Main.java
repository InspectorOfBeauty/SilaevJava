package com.astondevs.silaev.trainee;

import com.astondevs.silaev.trainee.tasks.Task1;
import com.astondevs.silaev.trainee.tasks.Task2;
import com.astondevs.silaev.trainee.tasks.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Программа запущена..." +
                    "\n=====================" +
                    "\nЗАДАНИЕ 1: " +
                    "\nСоставить алгоритм: если введенное число больше 7, то вывести \"Привет\"." +
                    "\n" +
                    "\nДля проверки введите целое число:");
            int num = Integer.parseInt(scanner.nextLine().trim());
            System.out.println();
            System.out.println("Результат:");
            Task1.checkingTheNumber(num);
            System.out.println("---------------------");


            System.out.println("ЗАДАНИЕ 2:" +
                    "\nСоставить алгоритм: если введенное имя совпадает с Вячеслав, " +
                    "\nто вывести \"Привет, Вячеслав\", если нет, то вывести \"Нет такого имени\"." +
                    "\n" +
                    "\nДля проверки введите имя на кириллице:");
            String name = scanner.nextLine().trim();
            System.out.println();
            System.out.println("Результат:");
            Task2.checkingTheString(name);
            System.out.println("---------------------");


            System.out.println("ЗАДАНИЕ 3:" +
                    "\nСоставить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3." +
                    "\n" +
                    "\nДля проверки введите последовательность чисел через пробел:");
            String[] sequenceOfNumbers = scanner.nextLine().trim().split(" ");
            int[] numbers = new int[sequenceOfNumbers.length];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(sequenceOfNumbers[i]);
            }
            System.out.println();
            System.out.println("Результат:");
            Task3.checkingTheArray(numbers);
            System.out.println("---------------------");


            System.out.println("Нажмите \"ENTER\", чтобы выйти из программы...");
            scanner.nextLine();
        }
    }
}