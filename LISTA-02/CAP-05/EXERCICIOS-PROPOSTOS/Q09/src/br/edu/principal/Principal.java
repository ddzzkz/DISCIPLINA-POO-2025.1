package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, soma_idades = 0;
        double peso, altura;
        int cont_pesadas_baixas = 0;
        int cont_altos = 0;
        int cont_altos_idade_entre10e30 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.print("Digite o peso: ");
            peso = sc.nextDouble();

            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();

            soma_idades += idade;

            if (peso > 90 && altura < 1.50) {
            	cont_pesadas_baixas++;
            }

            if (altura > 1.90) {
            	cont_altos++;
                if (idade >= 10 && idade <= 30) {
                	cont_altos_idade_entre10e30++;
                }
            }
        }

        double media_idades = soma_idades / 10.0;
        double porcentagem = 0;
        if (cont_altos > 0) {
            porcentagem = (cont_altos_idade_entre10e30 * 100.0) / cont_altos;
        }

        System.out.println("Resultados:");
        System.out.println("Média das idades: " + media_idades);
        System.out.println("Quantidade de pessoas com peso > 90kg e altura < 1.50m: " + cont_pesadas_baixas);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as que medem mais de 1.90m: " + porcentagem + "%");
    }
}
