package org.example.Sem1;
/*
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
в качестве кода ошибки, иначе - длину массива.
 */

public class Task1 {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4};
        int minimal = 5;
        System.out.println(CheckArray(array, minimal));
    }
    public static Integer CheckArray(Integer[] array, int min_value){
        if (array.length < min_value){
            return -1;
        }
        return min_value;
    }
}
