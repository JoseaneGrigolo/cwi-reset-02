package exercicio01;

public class Aplicacao {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.soma(5 , 10);
        System.out.println(resultadoSoma);

        int resultadoSubtrai = calculadora.subtrai(15 , 10);
        System.out.println(resultadoSubtrai);

        int resultadoMultiplica = calculadora.multiplica(5 , 15);
        System.out.println(resultadoMultiplica);

        int resultadoDivide = calculadora.divide(50 , 10);
        System.out.println(resultadoDivide);


    }
}
