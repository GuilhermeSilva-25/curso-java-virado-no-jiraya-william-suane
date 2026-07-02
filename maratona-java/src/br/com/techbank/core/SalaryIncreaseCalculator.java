package br.com.techbank.core;

public class SalaryIncreaseCalculator {
    public static void main(String[] args) {
        double previousSalary = 5_000;
        double newSalary = 7_500;
        double difference = newSalary - previousSalary;
        double percentageIncrease = (difference / previousSalary) * 100;

        System.out.println("=== RELATÓRIO DE PROMOÇÃO ===");
        System.out.printf("Aumento em Reais: R$ %.2f%n", difference);
        System.out.printf("Aumento Percentual: %.1f%%%n", percentageIncrease);
    }
}
