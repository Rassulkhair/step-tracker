package org.example;

import java.util.Scanner;

public class StepTracker {
    Scanner scanner;
    MonthData[] monthData = new MonthData[12];

    StepTracker(Scanner scan) {
        scanner = scan;
        for (int i = 0; i < monthData.length; i++) {
            monthData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {
    }

    public void changeStepGoal() {
    }

    public void printStatistic() {
    }
}
