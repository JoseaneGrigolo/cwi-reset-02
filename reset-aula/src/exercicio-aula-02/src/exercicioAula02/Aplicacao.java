package exercicioAula02;

public class Aplicacao {
    public static void main(String[] args) {

        Diretor diretorUm = new Diretor("Niki Caro", 54, 20, Genero.FEMININO);
        Filme filmeUm = new Filme("Mulan", "Disney", 115,
                2020, 5, diretorUm);
        Diretor diretorDois = new Diretor("Guy Ritchie", 53, 30, Genero.MASCULINO);
        Filme filmeDois = new Filme("Alladin", "Disney",
                129, 2019, 4, diretorDois);
        System.out.println(filmeUm.reproduzir());
        System.out.println(filmeDois.reproduzir());

        Ator atorUm = new Ator("George", 50, 5, Genero.MASCULINO);

        System.out.println(atorUm.imprimir());
        System.out.println(diretorUm.imprimir());


    }
}


