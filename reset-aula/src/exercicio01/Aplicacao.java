package exercicio01;

import java.util.Locale;

public class Aplicacao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Calculadora calculadora = new Calculadora();

        double resultadoSoma = calculadora.soma(5 , 10.7);
        System.out.printf("Resultado da soma: %.2f\n", resultadoSoma);

        double resultadoSubtrai = calculadora.subtrai(15.7 , 10);
        System.out.printf("Resultado da subtração: %.2f\n", resultadoSubtrai);

        double resultadoMultiplica = calculadora.multiplica(5.5 , 15);
        System.out.printf("Resultado da multiplicação: %.2f\n", resultadoMultiplica);

        double resultadoDivide = calculadora.divide(50.1 , 10);
        System.out.printf("Resultado da divisão: %.2f\n", resultadoDivide);


    }
}
