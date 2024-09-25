package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        float temperaturecelsium = scanner.nextFloat();
        float temperaturefarenheit = (temperaturecelsium * 9 / 5) + 32;
        System.out.print("Температура в градусах Фаренгейта:" + temperaturefarenheit);
        scanner.close();
    }
}