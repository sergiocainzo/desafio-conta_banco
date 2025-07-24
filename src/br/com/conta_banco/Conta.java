package br.com.conta_banco;

public abstract class Conta implements IConta {
    // Atributos
    protected String tipoConta;
    protected int agencia, conta;
    protected double saldo;
    protected Cliente cliente;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    // Construtor
    public Conta(Cliente cliente, String tipoConta) {
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    // Metodo Getter
    public String getTipoConta() {
        return tipoConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Metodos Personalizados
    // Metodo para Sacar
    @Override
    public double sacar(double valorSaque) {
        if (valorSaque <= 0) {
            System.out.println(String.format("Valor do Saque inválido."));
            return -1.0;
        }
        if (this.getSaldo() > 0 && this.getSaldo() >= valorSaque) {
            this.saldo -= valorSaque;
            System.out.println(String.format("Saque de R$%.2f realizado com sucesso.", valorSaque));
            return valorSaque;
        } else {
            System.out.println(String.format("Saque inválido. Saldo ou Valor inválido."));
            return -1.0;
        }
    }

    // Metodo de Depositar
    @Override
    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            this.saldo += valorDeposito;
            System.out.println(String.format("Deposito de R$%.2f realizado com sucesso.", valorDeposito));
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Metodo de Transferir
    @Override
    public void transferir(double valorTransferencia, IConta contaDestino) {
        if (valorTransferencia <= 0) {
            System.out.println(String.format("Valor informado é inválido."));
            return;
        }

        double valorSacado = this.sacar(valorTransferencia);
        if (valorSacado != -1.0) {
            contaDestino.depositar(valorTransferencia);
            System.out.println(String.format("Transferência de R$%.2f realizada com sucesso da Conta %s para Conta %s",
                    valorTransferencia, this.getTipoConta(), ((Conta) contaDestino).getTipoConta()));
        } else {
            System.out.println(
                    String.format("Não foi possível realizar a transferência: Saldo insuficiente ou valor inválido."));
        }
    }

    // Metodo para Imprimir dados da conta.
    public void imprimirInfoComuns() {
        System.out.println(String.format("Tipo de conta: %s", this.getTipoConta()));
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Conta: %d", this.getConta()));
        System.out.println(String.format("Saldo: R$%.2f", this.getSaldo()));
    }

}
