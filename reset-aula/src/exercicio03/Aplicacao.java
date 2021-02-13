package exercicio03;

public class Aplicacao {

    public static void main(String[] args) {

        Alunos aluno = new Alunos("Pedro", 6.9);
        aluno.setNotaFinal(8.0);

        System.out.println("Nome do aluno: " + aluno.getNome() + "\nNota final: " + aluno.getNotaFinal() + "\nSituação de aprovação: " + aluno.isAprovado());
    }
}
