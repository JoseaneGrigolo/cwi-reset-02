package exercicioAula02;

public class Diretor extends Pessoa {

    private int qtdadeFilmesDirigidos;

    public Diretor(String nome, int idade, int qtdadeFilmesDirigidos, Genero genero) {
        super(nome, idade, genero);
        this.qtdadeFilmesDirigidos = qtdadeFilmesDirigidos;
    }

    public int getQtdadeFilmesDirigidos() {
        return qtdadeFilmesDirigidos;
    }

    public String imprimir() {
        return  "Diretor: " + getNome() +"\n" +
                "Quantidade Filmes Dirigidos: " + getQtdadeFilmesDirigidos();

    }
}
