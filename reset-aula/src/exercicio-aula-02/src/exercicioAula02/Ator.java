package exercicioAula02;

public class Ator extends Pessoa {

    private int numOscars;

    public Ator(String nome, int idade, int numOscars, Genero genero) {
        super(nome, idade, genero);
        this.numOscars = numOscars;
    }

}
