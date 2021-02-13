package exercicioAula02;

public class Pessoa {

    private String nome;
    private int idade;
    private Genero genero;


    public Pessoa(String nome, int idade, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String imprimir() {
        return "Nome= " + nome + "\n" +
                "Idade= " + idade + "\n" +
                "Genero= " + genero.getDescricao();
    }
}
