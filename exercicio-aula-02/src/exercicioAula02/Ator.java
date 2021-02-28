package exercicioAula02;

import java.time.LocalDate;

public class Ator extends Pessoa {

    private int numOscars;

    public Ator(String nome, LocalDate dataNascimento, int numOscars, Genero genero) {
        super(nome, dataNascimento, genero);
        this.numOscars = numOscars;
    }

    public int getNumOscars() {
        return numOscars;
    }

    public String imprimir() {
        //super.imprimir();
        return   super.imprimir() + "\n" +
               // "Ator: " + getNome() + "\n" +
                "Numero de Oscars: " + getNumOscars();

    }
}
