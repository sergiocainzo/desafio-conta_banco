package br.com.conta_banco;

public class ContaCorrente extends Conta {

    // Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente, "CORRENTE");
    }

    // Metodo de Exibição
    @Override
    public void imprimirExtrato() {
        System.out.println("\t --- Extrato ---");
        this.imprimirInfoComuns();
        System.out.println("------------------------------\n");
    }


}
