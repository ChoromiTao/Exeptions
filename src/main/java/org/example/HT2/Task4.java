package org.example.HT2;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя
 */
public class Task4 {
    public static void main(String[] args) {
        input();
    }
    public static String input(){
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя! Вы должны ввести что-нибудь!");
        }
        return line;
    }
}
