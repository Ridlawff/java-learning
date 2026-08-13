package app;

public class Program {
    public static void main(String[] args) {
        /* %d: para variáveis inteiras (int)
           %c: para variaveis de caracteres (char)
           %f: para variáveis decimais (double)
           %.2f => o valor é formatado usando 2 casas decimais
         */

        int inteiro1 = 10;
        int inteiro2 = 3;
        double decimal1 = 10;
        double decimal2 = 3;

        int divisao1 = inteiro1 / inteiro2;
        double divisao2 = decimal1 / decimal2;

        System.out.printf("%d / %d = %d\n", inteiro1, inteiro2, divisao1 );

        System.out.printf("%.2f / %.2f = %.2f\n", decimal1, decimal2, divisao2);
    }
}
