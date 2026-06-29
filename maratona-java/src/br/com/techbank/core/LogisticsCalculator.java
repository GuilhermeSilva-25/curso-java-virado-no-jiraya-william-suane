package br.com.techbank.core;

public class LogisticsCalculator {
    public static void main(String[] args) {
        double exactWeight = 75.894;
        int weightForCarrier = (int) exactWeight;

        System.out.printf("Peso exato: %.3f kg%nPeso declarado (truncado): %d kg%n", exactWeight
        , weightForCarrier);
    }
}
