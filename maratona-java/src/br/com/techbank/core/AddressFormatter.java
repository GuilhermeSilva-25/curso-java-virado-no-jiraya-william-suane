package br.com.techbank.core;

public class AddressFormatter {
    public static void main(String[] args) {
        String street = "Av. Paulista";
        int number = 1500;
        String neighborhood = "Bela Vista";
        String city = "São Paulo";
        String state = "SP";
        String formattedAddress = String.format("Entrega para: %s, %d - %s, %s - %s", street, number, neighborhood, city, state);

        System.out.println(formattedAddress);
    }
}
