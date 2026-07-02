package br.com.techbank.core;

public class FreeShippingValidator {
    public static void main(String[] args) {
        double purchaseAmount = 300;
        boolean isPremiumCustomer = true;
        int distanceInKm = 30;
        boolean hasEligibleFreeShipping = purchaseAmount >= 250 && isPremiumCustomer && distanceInKm < 50;

        System.out.println("=== STATUS DO FRETE ===");
        System.out.printf("O cliente ganhou frete grátis? %b%n", hasEligibleFreeShipping);
    }
}
