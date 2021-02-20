package exercicioAula02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate meuNascimento = LocalDate.parse("25-09-1985", formatter);

        Pessoa pessoa = new Pessoa("Josie", meuNascimento, Genero.FEMININO);

        System.out.println(pessoa.imprimir());
        /*
        Ator atorUm = new Ator("George", LocalDate.now(), 5, Genero.MASCULINO);
        Ator atorDois = new Ator("Gisele", LocalDate.now(), 5, Genero.FEMININO);
        Ator atorTres = new Ator("Lucas", LocalDate.now(), 5, Genero.MASCULINO);
        Diretor diretorUm = new Diretor("Niki Caro", LocalDate.now(), 20, Genero.FEMININO);

        List<Pessoa> lista = new ArrayList();
        lista.add(diretorUm);
        lista.add(atorUm);
        lista.add(atorDois);
        lista.add(atorTres);

        Filme filmeUm = new Filme("Mulan", "Disney", 115,
                2020, 5, diretorUm, lista);

        filmeUm.exibirCreditos();

       // Diretor diretorDois = new Diretor("Guy Ritchie", 53, 30, Genero.MASCULINO);
       // Filme filmeDois = new Filme("Alladin", "Disney",
       //          129, 2019, 4, diretorDois);
       // System.out.println(filmeDois.reproduzir());
       // System.out.println(diretorUm.imprimir());
      // System.out.println(filmeUm.reproduzir());
*/

    }
}


