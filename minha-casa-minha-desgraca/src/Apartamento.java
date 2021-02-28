public class Apartamento extends Imovel{

    private int andar;

    public Apartamento(Endereco endereco, double valor, int andar) {
        super(endereco, valor);
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }

    public String apresentacao() {
        return "Imovel: Apartamento \n" +
                "Endereco= " + getEndereco().getEstado() + "\n" +
                "Andar= " + getAndar() + "\n" +
                "Valor= R$ " + getValor();
    }
}
