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

    public String apresentacao() {
        return "Imovel: \n" +
                "Endereco= " + endereco.getEstado() + "\n" +
                "Valor= R$ " + valor;
    }
}
