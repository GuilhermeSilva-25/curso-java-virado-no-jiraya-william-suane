package br.com.techbank.core;

public class VipRegistrationTest {
    public static void main(String[] args) {
        char firstLetterOfTheName = 71;
        int customerAge = 35;
        double declaredMonthlyIncome = 25_500.50;
        boolean hasRestriction = false;

        System.out.println("--- DADOS DO CLIENTE ---");
        System.out.printf("Primeira letra do nome: %c%n", firstLetterOfTheName);
        System.out.printf("Idade: %d%n", customerAge);
        System.out.printf("Renda Mensal: R$ %.2f%n", declaredMonthlyIncome);
        System.out.printf("Possui restrição no nome: %b%n", hasRestriction);
    }
}
