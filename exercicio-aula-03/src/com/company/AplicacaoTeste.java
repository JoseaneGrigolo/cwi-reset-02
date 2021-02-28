package com.company;

import com.company.domain.Editora;
import com.company.domain.Filme;
import com.company.enums.Genero;
import com.company.heranca.Diretor;

public class AplicacaoTeste {

    public static void main(String[] args) {

        Editora edit = new Editora("Dc Comics", "Brasil");

       Diretor diretor = new Diretor("Lucas", 60, 20, Genero.MASCULINO);
       Filme filme = new Filme("Star Wars","ficção", 200, 2014, 6, diretor);



    }

}
