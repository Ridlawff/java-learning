package app.fundamentos.imc;

import java.util.Scanner;

public class Imc {
    public static void main ( String [] args ){

        System.out.println("Vamos saber qual é o seu IMC!");

        Scanner scan = new Scanner (System.in);

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String nome = scan.nextLine();

        System.out.println(" Digite o seu peso: ");
        float peso = Float.parseFloat(scan.nextLine().replace(",","."));
        System.out.println("Digite a sua altura: ");
        float altura = Float.parseFloat(scan.nextLine().replace(",","."));
        float imc = peso / ( altura * altura);

        System.out.printf(nome+", o seu IMC é de %.2f",imc);
        scan.close();
    }
}