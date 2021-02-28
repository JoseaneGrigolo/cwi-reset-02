package oo;

public class Main {

    public static void main(String[] args) {


        int tres = 3;
        int seis = 6;
        int multiplicacao = tres * seis;
        int resto = seis % tres;
        boolean maior = (6 > 3);

        System.out.println("#1");
        System.out.println(tres + " multiplicado por " + seis + " é igual a " + multiplicacao + ".");
        System.out.printf("%d multiplicado por %d é igual a %d.\n", tres, seis, multiplicacao);
        System.out.printf("%d multiplicado por %d é igual a %d.", tres, seis, (tres * seis));
        System.out.println("\n#2");
        System.out.println("O resto da divisão de " + seis + " por " + tres + " é " + resto + ".");
        System.out.printf("O resto da divisão de %d por %d é %d.\n", seis, tres, resto);
        System.out.printf("O resto da divisão de %d por %d é %d.", seis, tres, (seis % tres));
        System.out.println("\n#3");
        System.out.println("6 é maior que 3? " + (6 > 3));
        System.out.printf("%d é maior que %d? %s", seis, tres, maior);


    }
}
