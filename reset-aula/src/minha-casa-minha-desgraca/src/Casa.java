public class Casa extends Imovel {

    private boolean patio;

    public Casa(Endereco endereco, double valor, boolean patio) {
        super(endereco, valor);
        this.patio = patio;
    }

    public boolean isPatio() {
        return patio;
    }

    public String apresentacao() {
        return "Imovel: Casa \n" +
                "Endereco= " + getEndereco().getEstado() + "\n" +
                "Tem Patio?= " + isPatio() + "\n" +
                "Valor= R$ " + getValor();
    }
}
