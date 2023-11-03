package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Converter  {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть операцію (1 - милі в кілометри, 2 - кілометри в милі): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Введите расстояние в милях: ");
            double miles = scanner.nextDouble();
            double kilometers = milesToKilometers(miles);
            System.out.println(miles + " миль = " + kilometers + " километров");

        }
    }
}

