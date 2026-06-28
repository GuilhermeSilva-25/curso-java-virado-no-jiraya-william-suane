package br.com.techbank.core;

/**
 * Performs a simple financial calculation by applying a percentage rate
 * to an initial monetary value.
 */
public class FinancialCalculator {
    public static void main(String[] args) {
        double initialValue = 1_000;
        double rate = 0.05;
        double interestAmount = initialValue * rate;
        System.out.printf("O resultado é: %.2f%n", interestAmount);
    }
}