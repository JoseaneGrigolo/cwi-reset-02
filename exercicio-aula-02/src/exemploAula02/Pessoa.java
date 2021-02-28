package exemploAula02;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void fazAniver() {
        this.idade = ++idade;
    }
}
