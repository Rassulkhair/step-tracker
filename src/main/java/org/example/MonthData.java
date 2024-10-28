package org.example;

public class MonthData {
    int[] days = new int[30];

    // TODO: вывод на экран элементов массива в необходимом формате
    void printDaysAndStepsFromMonth() {
        for (int j = 0; j <= days.length - 1; j++) {
            System.out.println((j + 1) + " день: " + days[j] + " шагов");
        }
    }

    // TODO: подсчёт суммы шагов за месяц.
    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int j = 0; j <= days.length - 1; j++) {
            sumSteps = sumSteps + days[j];
        }
        return sumSteps;
    }

    // TODO: максимальное количество шагов за месяц
    int maxSteps() {
        int maxSteps = 0;
        for (int j = 0; j <= days.length - 1; j++) {
            if (days[j] > maxSteps) {
                maxSteps = days[j];
            }
        }
        return maxSteps;
    }

    // TODO: поиск максимальной серии
    int bestSeries(int goalByStepsPerDay) {
        return 0;
    }
}
