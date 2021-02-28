package exercicioAula02;

import java.time.LocalDate;

public class Diretor extends Pessoa {

    private int qtdadeFilmesDirigidos;

    public Diretor(String nome, LocalDate dataNascimento, int qtdadeFilmesDirigidos, Genero genero) {
        super(nome, dataNascimento, genero);
        this.qtdadeFilmesDirigidos = qtdadeFilmesDirigidos;
    }

    public int getQtdadeFilmesDirigidos() {
        return qtdadeFilmesDirigidos;
    }

    public String imprimir() {
        //super.imprimir(); Inserir este e retirar getNome
        return  super.imprimir() + "\n" +
               // "Diretor: " + getNome() +"\n" +
                "Quantidade Filmes Dirigidos: " + getQtdadeFilmesDirigidos();

    }
}
