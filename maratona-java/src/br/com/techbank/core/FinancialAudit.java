package br.com.techbank.core;

public class FinancialAudit {
    public static void main(String[] args) {
        boolean isAccountUnderInvestigation = false;
        if(isAccountUnderInvestigation){
            System.out.println("ALERTA: conta bloqueada para transferência devido a suspeita de fraude.");
        }
        System.out.println("Processo de auditoria finalizado.");
    }
}
