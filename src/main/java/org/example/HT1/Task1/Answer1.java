package org.example.HT1.Task1;
/*
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

Метод arrayOutOfBoundsException - Ошибка, связанная с выходом за пределы массива

Метод divisionByZero - Деление на 0

Метод numberFormatException - Ошибка преобразования строки в число

Важно: они не должны принимать никаких аргументов
 */
public class Answer1 {
        public static void arrayOutOfBoundsException() {
            // Напишите свое решение ниже
            Integer[] array = new Integer[]{1, 2, 3, 4, 5};
            System.out.println(array[7]);
        }

        public static void divisionByZero() {
            // Напишите свое решение ниже
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }

        public static void numberFormatException() {
            // Напишите свое решение ниже
            String hello = "Hello, console!";
            int a = Integer.parseInt(hello);
        }

}
