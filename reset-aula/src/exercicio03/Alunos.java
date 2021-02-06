package exercicio03;

public class Alunos {

    private String nome;
    private double notaFinal;

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

    boolean isAprovado(){
        if(this.notaFinal >= 7.0){
            return true;
        } else {
            return false;
        }
    }

}
