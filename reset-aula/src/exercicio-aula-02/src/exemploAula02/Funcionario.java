package exemploAula02;

public class Funcionario extends Pessoa {

    private double salario;
    private Cargo cargo;
    private String status;
    private int anosEmpresa;

    public Funcionario(String nome, int idade, String cpf, double salario, Cargo cargo, String status) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.cargo = cargo;
        this.status = status;
        this.anosEmpresa = 0;
    }

    public double calcularSalLiq() {
        return this.salario * 0.8 * cargo.getBonus();
    }

    @Override
    public void fazAniver() {
        super.fazAniver();
        this.anosEmpresa = ++this.anosEmpresa;
    }

    @Override
    public String toString() {
        return "Funcionario: \n" +
                "Salario: " + salario + "\n" +
                "Cargo: " + cargo.getDescricao() + "\n" +
                "Status: " + status + "\n" +
                "Anos de Empresa: " + anosEmpresa;
    }
}
