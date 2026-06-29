package br.com.techbank.core;

public class LoanSimulation {
    public static void main(String[] args) {
        String customerName = "Guilherme";
        int customerAge = 31;
        double loanAmount = 15_500.75;
        boolean isApproved = true;

        System.out.println("=== RELATÓRIO DE EMPRÉSTIMO ===");
        System.out.printf("Cliente: %s%n", customerName);
        System.out.printf("Idade: %d%n", customerAge);
        System.out.printf("Valor Solicitado: R$ %.2f%n", loanAmount);
        System.out.printf("Status de Aprovação: %b%n", isApproved);
    }
}
