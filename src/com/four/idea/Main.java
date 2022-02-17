package com.four.idea;

public class Main {
    public static void main(String[] args)  {
    double x = 15;
    double y = 22;
    double z = 32;
    double xyz = (x + y + z) / 3; //Среднее арифметическое чисел
        System.out.println(xyz);

        double xyzMF = xyz / 2;
        double result = Math.floor(xyzMF); //Окруление в меньшую сторону = 11. По заданию в консоль выводить не надо

        if (result > 3)
            System.out.println("Программа выполнена корректно");

    }
}
