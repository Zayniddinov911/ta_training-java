package com.epam.training.student_Ibrat_Zayniddinov;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int minutes = seconds / 60;
        int rem_seconds = seconds % 60;
        int hours = minutes / 60;
        int rem_minutes = minutes % 60;
        System.out.println(hours + ":" + rem_minutes + ":" + rem_seconds);

    }
}