public class Diretor {

    private String nomeDiretor;
    private int idade;
    private int qtdadeFilmesDirigidos;

    public Diretor(String nomeDiretor, int idade, int qtdadeFilmesDirigidos) {
        this.nomeDiretor = nomeDiretor;
        this.idade = idade;
        this.qtdadeFilmesDirigidos = qtdadeFilmesDirigidos;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

}
