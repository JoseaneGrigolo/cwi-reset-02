public class Aplicacao {

    public static void main(String[] args) {

        Filme filmeUm = new Filme("Mulan", "Disney",
                115, 2020, 5);
        filmeUm.setNomeDiretor("Niki Caro");

        Filme filmeDois = new Filme("Alladin", "Disney",
                129, 2019, 4);
        filmeDois.setNomeDiretor("Guy Ritchie");

        System.out.println(filmeUm.reproduzir());
        System.out.println(filmeDois.reproduzir());



    }
}
