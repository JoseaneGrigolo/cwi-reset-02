package exercicioAula02;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Ator atorUm = new Ator("George", 50, 5, Genero.MASCULINO);
        Ator atorDois = new Ator("Gisele", 40, 5, Genero.FEMININO);
        Ator atorTres = new Ator("Lucas", 60, 5, Genero.MASCULINO);
        Diretor diretorUm = new Diretor("Niki Caro", 54, 20, Genero.FEMININO);
        List<Pessoa> lista = new ArrayList();
        lista.add(diretorUm);
        lista.add(atorUm);
        lista.add(atorDois);
        lista.add(atorTres);

        Filme filmeUm = new Filme("Mulan", "Disney", 115,
                2020, 5, diretorUm, lista);

       // Diretor diretorDois = new Diretor("Guy Ritchie", 53, 30, Genero.MASCULINO);
      //  Filme filmeDois = new Filme("Alladin", "Disney",
      //          129, 2019, 4, diretorDois);
      // System.out.println(filmeDois.reproduzir());
      //  System.out.println(diretorUm.imprimir());

        System.out.println(filmeUm.creditos());
        System.out.println(filmeUm.reproduzir());


    }
}


