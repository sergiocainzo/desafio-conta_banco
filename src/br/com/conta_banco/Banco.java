package br.com.conta_banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    // Atributos
    private String nomeBanco;
    private List<Conta> contasCadastradas;

    public Banco() {
        this.nomeBanco = "Banco SHPC";
        this.contasCadastradas = new ArrayList<>();
    }

    // Getter and Setter
    public String getNomeBanco() {
        return nomeBanco;
    }

    // Metodo para adicionar uma conta ao Banco
    public void adicionarConta(Conta conta) {
        this.contasCadastradas.add(conta);
        System.out.println("Conta " + conta.getTipoConta() + " (Ag: " + conta.getAgencia() + ", Cnt: "
                + conta.getConta() + ") cadastrada com sucesso no banco " + this.nomeBanco + ".");
    }

    // Metodo para imprimir todas as contas do banco
    public void imprimirTodasAsContas() {
        System.out.println("\n--- Lista de Contas Abertas no " + this.nomeBanco + " ---");
        if (contasCadastradas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contasCadastradas) {
                conta.imprimirInfoComuns();
            }
        }
        System.out.println("------------------------------------\n");
    }

}
