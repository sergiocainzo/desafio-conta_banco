import java.util.Scanner;

import br.com.conta_banco.Banco;
import br.com.conta_banco.Cliente;
import br.com.conta_banco.Conta;
import br.com.conta_banco.ContaCorrente;
import br.com.conta_banco.ContaPoupanca;


public class App {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // Instância do Objeto Banco
        Banco meuBanco = new Banco();

        // Solicitação do nome do cliente
        System.out.print("Qual o nome completo do cliente? ");
        String nomeCompleto = scan.nextLine().trim().toUpperCase();
        Cliente cliente = new Cliente();
        cliente.setNome(nomeCompleto);

        // O tipo de conta que deverá ser aberta
        System.out.print("Qual tipo de conta deseja abrir? (cc - Conta Corrente | cp - Conta Poupança): ");
        String tipo = scan.nextLine().trim().toLowerCase();
        // Caso o tipo da conta indicado seja diferente das solicitadas.
        while (!tipo.equals("cc") && !tipo.equals("cp")) {
            System.out.println("Opção inválida.");
            System.out.print("Qual tipo de conta deseja abrir? (cc - Conta Corrente | cp - Conta Poupança): ");
            tipo = scan.nextLine().trim().toLowerCase();
        }

        // A novaConta é nula
        Conta novaConta = null;

        // Condicional para criação da conta selecionada.
        if (tipo.equals("cc")) {
            System.out.println("Criando Conta Corrente...");
            novaConta = new ContaCorrente(cliente);
        } else {
            System.out.println("Criando Conta Poupança...");
            novaConta = new ContaPoupanca(cliente);
        }

        // Adicionando Conta ao Banco
        meuBanco.adicionarConta(novaConta);

        // Depositando dinheiro na conta
        novaConta.depositar(1000);

        // Imprimindo Extrato
        novaConta.imprimirExtrato();

        // Imprimindo Todas as contas do Banco
        meuBanco.imprimirTodasAsContas();


        // Encessando conexão com o Scanner
        scan.close();

    }
}
