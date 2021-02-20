package exercicioAula02;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;


    public Pessoa(String nome, LocalDate dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public Genero getGenero() {
        return genero;
    }



    public String imprimir() {
        return "Nome= " + nome + "\n" +
                "Data Nascimento= " + Period.between(this.dataNascimento, LocalDate.now()).getYears() + "\n" +
                "Genero= " + genero.getDescricao();
    }
}
