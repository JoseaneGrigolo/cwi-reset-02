public class Imovel {

    private Endereco endereco;
    private double valor;

    public Imovel(Endereco endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Imovel: \n" +
                "Endereco= " + endereco + "\n" +
                "Valor= R$ " + valor;
    }
}
