package exercicioAula02;

public class Ator extends Pessoa {

    private int numOscars;
    private Genero genero;

    public Ator(String nome, int idade, int numOscars, Genero genero) {
        super(nome, idade);
        this.numOscars = numOscars;
        this.genero = genero;

    }


}
