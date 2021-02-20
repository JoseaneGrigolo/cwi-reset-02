package exercicioAula02;

import java.time.LocalDate;

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
                "Data Nascimento= " + dataNascimento + "\n" +
                "Genero= " + genero.getDescricao();
    }
}
