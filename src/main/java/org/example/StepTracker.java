package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12];
    final int DAYS = 30;
    int goalByStepsPerDay = 10_000;
    Converter converter = new Converter();

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
        System.out.println("Введи день");
        int day = scanner.nextInt();
        System.out.println("Введи месяц");
        int month = scanner.nextInt();
        System.out.println("Введи кол-во шагов");
        int steps = scanner.nextInt();
        if ((month <= monthData.length && month > 0) && (day <= DAYS && day > 0) && steps > 0) {
            for (int i = 0; i <= monthData.length - 1; i++) {
                if (i == month - 1) {
                    for (int j = 0; j <= monthData[i].days.length - 1; j++) {
                        if (j == day - 1) {
                            monthData[i].days[j] = steps;
                        }
                    }
                }
            }

        } else {
            System.out.println("Некорректные данные");
        }
    }

    public void changeStepGoal() {
        System.out.println("Введи цель");
        int goal = scanner.nextInt();
        if (goal > 0) {
            goalByStepsPerDay = goal;
        }
    }

    public void printStatistic() {
        System.out.println("Введи месяц");
        int month = scanner.nextInt();
        if (month <= monthData.length && month > 0) {
            for (int i = 0; i <= monthData.length - 1; i++) {
                if (i == month - 1) {
                    monthData[i].printDaysAndStepsFromMonth();
                    System.out.println("Общее кол-во шагов " + monthData[i].sumStepsFromMonth());
                    System.out.println("Макс шагов " + monthData[i].maxSteps());
                    System.out.println("Твоя лучшая серия " + monthData[i].bestSeries(goalByStepsPerDay));
                    System.out.println("Пройденная дистанция (в км) " +
                            converter.convertToKm(monthData[i].sumStepsFromMonth()));
                    System.out.println("количество сожжённых килокалорий "
                            + converter.convertStepsToKilocalories(monthData[i].sumStepsFromMonth()));
                }
            }
        }
    }
}