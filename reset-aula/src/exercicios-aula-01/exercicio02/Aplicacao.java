package exercicio02;

public class Aplicacao {

    public static void main(String[] args) {

        Comparador comparador = new Comparador();

        boolean resultadoMenorQue = comparador.menorQue(15, 9);

        System.out.println(resultadoMenorQue);
    }
}
