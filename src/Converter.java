package com.gmail.zavsek_o2;

import java.util.Scanner;

public class Converter  {
    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите вариант (1 - Мили в километры, 2 - Километры в мили): ");
        int choice = scanner.nextInt();

    }
}