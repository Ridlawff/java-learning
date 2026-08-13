package app.fundamentos.entrada;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        String nome;
        int idade;
        double altura;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = Integer.parseInt( scan.nextLine() );

        System.out.println("Digite o seu peso: ");
        altura = Double.parseDouble(scan.nextLine().replace(",","."));

        System.out.printf(nome+", boa noite! Você tem a idade de %d anos, e %.2f de altura.",idade,altura);

        scan.close();
    }
}
