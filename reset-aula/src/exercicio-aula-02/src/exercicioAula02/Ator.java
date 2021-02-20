package exercicioAula02;

public class Ator extends Pessoa {

    private int numOscars;

    public Ator(String nome, int idade, int numOscars, Genero genero) {
        super(nome, idade, genero);
        this.numOscars = numOscars;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public String imprimir() {
        return  "Ator: " + getNome() + "\n" +
                "Numero de Oscars: " + getNumOscars();

    }
}
