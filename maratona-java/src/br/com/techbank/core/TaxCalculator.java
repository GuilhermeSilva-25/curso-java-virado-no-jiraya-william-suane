package br.com.techbank.core;

public class TaxCalculator {
    public static void main(String[] args) {
        double monthlyProfit = 3_500.50;
        String taxCategory;

        if (monthlyProfit > 5_000.00) {
            taxCategory = "20% de imposto";
        } else if (monthlyProfit > 2_000.00) {
            taxCategory = "10% de imposto";
        } else {
            taxCategory = "Isento";
        }

        System.out.println("=== STATUS CONTÁBIL ===");
        System.out.printf("Com o lucro de R$ %.2f, a categoria é: %s\n", monthlyProfit, taxCategory);
    }
}
