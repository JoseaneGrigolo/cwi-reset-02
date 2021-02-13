package exercicio03;

public class Alunos {

    private String nome;
    private double notaFinal;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public Alunos(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    boolean isAprovado(){
        return notaFinal >= 7;
    }

}
