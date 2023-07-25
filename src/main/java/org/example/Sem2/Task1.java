package org.example.Sem2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
 Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap,
если студенты с ним знакомы). В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?,
заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?,
бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\princ\\OneDrive\\Desktop\\Обучение-учение\\GeekBrains\\Exeptions\\src\\main\\java\\org\\example\\Sem2\\Sem2Task1.txt");
        List<String[]> list = readFile(file);
        changeList(list);
        writeFile(list, file);
    }
    public static List<String[]> readFile(File file){
        List<String[]> list = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null){
                list.add(line.split("="));
            }
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public static void changeList(List<String[]> list){
        for (String[] el:list) {
            if (!checkExeption(el[1]) && !el[1].equals("?")){
                throw new RuntimeException();
            }
            if (el[1].equals("?")) el[1] = String.valueOf(el[0].length());
        }
    }
    public static boolean checkExeption(String line){
        try {
            Integer.parseInt(line);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    public static void writeFile(List<String[]> lst, File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (String[] el : lst) {
                bw.write(el[0] + "=" + el[1]);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
