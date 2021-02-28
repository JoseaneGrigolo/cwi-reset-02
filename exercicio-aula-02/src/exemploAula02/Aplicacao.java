package exemploAula02;

public class Aplicacao {

    public static void main(String[] args) {

        Pessoa pessoa = new Funcionario("Leo", 23, "00000000000", 10000, Cargo.ENGENHEIRO_SOLUCOES, "Contratado");
        pessoa.fazAniver();
        //System.out.println(funcionario.calcularSalLiq());
        System.out.println(pessoa.toString());
    }

}
