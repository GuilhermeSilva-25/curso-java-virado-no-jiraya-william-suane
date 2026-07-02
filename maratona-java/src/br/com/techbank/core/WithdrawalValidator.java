package br.com.techbank.core;

public class WithdrawalValidator {
    public static void main(String[] args) {
        double accountBalance = 500;
        double withdrawalAmount = 750;
        double specialLimit = 1_000;
        boolean canWithdrawWithoutLimit = withdrawalAmount
                <= accountBalance;
        boolean canWithdrawWithLimit = (accountBalance + specialLimit) >= withdrawalAmount;
        boolean isZeroBalance = accountBalance == 0;

        System.out.println("=== RELATÓRIO DE SAQUE ===");
        System.out.printf("Pode sacar sem usar o limite: %b%n", canWithdrawWithoutLimit);
        System.out.printf("Pode sacar usando o limite: %b%n", canWithdrawWithLimit);
        System.out.printf("O saldo é igual a zero: %b%n", isZeroBalance);
    }
}
