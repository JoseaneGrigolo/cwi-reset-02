package exercicioAula02;

public class Diretor extends Pessoa{

    private int qtdadeFilmesDirigidos;
    private Genero genero;

    public Diretor(String nome, int idade, int qtdadeFilmesDirigidos, Genero genero) {
        super(nome, idade);
        this.qtdadeFilmesDirigidos = qtdadeFilmesDirigidos;
        this.genero = genero;

    }

}
