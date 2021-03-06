public class Endereco {

    private String logradouro;
    private int numero;
    private int complemento;
    private String bairro;
    private String cidade;
    private UnidadeFederativa estado;

    public Endereco(String logradouro, int numero, int complemento, String bairro,
                    String cidade, UnidadeFederativa estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco(UnidadeFederativa estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public int getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public UnidadeFederativa getEstado() {
        return estado;
    }
}
