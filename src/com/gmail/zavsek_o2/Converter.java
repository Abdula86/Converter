package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Converter  {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант (1 - мили в километры, 2 - километры в мили): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите расстояние в милях: ");
            double miles = scanner.nextDouble();
            double kilometers = milesToKilometers(miles);
            System.out.println(miles + " миль = " + kilometers + " километров");
        } else if (choice == 2) {
            System.out.print("Введите расстояние в километрах: ");
            double kilometers = scanner.nextDouble();
            double miles = kilometersToMiles(kilometers);
            System.out.println(kilometers + " километров = " + miles + " миль");
        } else {
            System.out.println("Неправильный вибор");
        }

        scanner.close();
    }
}

