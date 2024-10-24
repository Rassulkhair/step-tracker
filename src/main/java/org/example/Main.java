package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StepTracker stepTracker = new StepTracker(scanner);
        while (true) {
            System.out.println("""
                    1) ввести количество шагов за определённый день;
                    2) изменить цель по количеству шагов в день;
                    3) напечатать статистику за определённый месяц;
                    4) выйти из приложения.""");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistic();
                case 4 -> {
                    return;
                }
            }
        }
    }
}