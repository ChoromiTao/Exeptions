package org.example.HT2;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
у пользователя ввод данных.
 */
public class Task1 {
    public static void main(String[] args) {
        input();
    }
    public static Float input(){
        System.out.println("Введите дробное число: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (checkExeption(line)){
            System.out.println("Да, всё корректно! " + line);
            return Float.parseFloat(line);
        }
        else {
            System.out.println("Введите число правильно!");
            return input();
        }
    }
    public static boolean checkExeption(String line){
        try {
            Float.parseFloat(line);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
