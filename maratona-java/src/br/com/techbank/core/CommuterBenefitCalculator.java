package br.com.techbank.core;

public class CommuterBenefitCalculator {
    public static void main(String[] args) {
        boolean hasTransportationBenefit = true;
        String discountRate = hasTransportationBenefit ? "6%" : "0%";

        System.out.println("=== STATUS DO RH ===");
        System.out.printf("Taxa de desconto do Vale Trasporte: %s%n", discountRate);
    }
}
