package br.com.techbank.core;

public class InventoryControl {
    public static void main(String[] args) {
        int paperStock = 100;
        paperStock--;
        paperStock += 50;
        paperStock /= 2;

        System.out.printf("O estoque final de resmas é: %d%n", paperStock);
    }
}
