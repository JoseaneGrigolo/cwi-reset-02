package exemploAula02;

public class Aplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Leo", 23, "000000000", 100, Cargo.ENGENHEIRO_SOLUCOES, "Contratado");
        funcionario.fazAniver();
        System.out.println(funcionario.calcularSalLiq());
        System.out.println(funcionario.toString());
    }

}
