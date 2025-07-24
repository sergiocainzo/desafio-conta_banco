package br.com.conta_banco;

public class Cliente {
    // Attributos
    private String nome;

    // Metodos Getter and Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + "]";
    }

}
