package br.com.conta_banco;

public interface IConta {

    double sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

}
