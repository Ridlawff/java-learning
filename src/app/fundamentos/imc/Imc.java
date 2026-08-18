package app.fundamentos.imc;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {

        System.out.println("Vamos saber qual é o seu IMC!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String nome = scan.nextLine();

        System.out.println(" Digite o seu peso: ");
        float peso = Float.parseFloat(scan.nextLine().replace(",", "."));
        System.out.println("Digite a sua altura: ");
        float altura = Float.parseFloat(scan.nextLine().replace(",", "."));
        float imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf(nome+", seu IMC é de %.2f. (Baixo Peso).%n", imc);
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf(nome+", seu IMC é de %.2f. (Peso Normal).%n", imc);
        } else if (imc > 24.9 && imc < 30.0) {
            System.out.printf(nome+", seu IMC é de %.2f. (Excesso de Peso).%n", imc);
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.printf(nome+", seu IMC é de %.2f. (Obesidade Grau 1).%n", imc);
        } else if (imc > 34.9 && imc <= 39.9) {
            System.out.printf(nome+", seu IMC é de %.2f. (Obesidade Grau 2).%n", imc);
        } else {
            System.out.printf(nome+", seu IMC é de %.2f. (Obesidade Mórbida).%n", imc);
        }

        scan.close();
    }
}