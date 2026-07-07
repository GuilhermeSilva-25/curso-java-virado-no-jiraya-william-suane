package br.com.techbank.core;

public class ServerAccessValidator {
    public static void main(String[] args) {
        String position = "Analista";
        String sector = "T.I";
        boolean hasTemporaryAuthorization = false;
        boolean isAccessGranted = position.equals("Diretor") || sector.equals("T.I") || hasTemporaryAuthorization;

        System.out.println("=== CONTROLE DE ACESSO ===");
        System.out.printf("Acesso à Sala de Servidores liberado? %b%n", isAccessGranted
        );
    }
}
