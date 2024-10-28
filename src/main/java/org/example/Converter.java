package org.example;

public class Converter {

    final int  DISTANCE = 75;
    final int CALORIESPERSTEP = 50;

    int convertToKm(int steps){
     return (DISTANCE  * steps)/100_000;
    }

    int convertStepsToKilocalories(int steps){
        return (CALORIESPERSTEP * steps) / 1_000;
    }
}
