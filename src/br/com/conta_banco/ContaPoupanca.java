package br.com.conta_banco;

public class ContaPoupanca extends Conta {

    // Constructor
    public ContaPoupanca(Cliente cliente) {
        super(cliente, "POUPANÇA");
    }

    // Metodo de Exibição
    @Override
    public void imprimirExtrato() {
        System.out.println("\t --- Extrato ---");
        this.imprimirInfoComuns();
        System.out.println("------------------------------\n");
    }

}
