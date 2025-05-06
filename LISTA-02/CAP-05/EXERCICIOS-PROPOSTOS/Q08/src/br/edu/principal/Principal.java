package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade, pessoas50maisPesoMenor60 = 0, pessoasComOlhosAzuis = 0, pessoasRuivasNaoAzuis = 0, totalPessoas = 6;
        double peso, altura, somaIdadesAlturaMenor150 = 0;
        int pessoasAlturaMenor150 = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();

            System.out.print("Digite o peso: ");
            peso = sc.nextDouble();

            System.out.print("Digite a altura: ");
            altura = sc.nextDouble();

            System.out.print("Digite a cor dos olhos (A — azul; P — preto; V — verde; C — castanho): ");
            char corOlhos = sc.next().charAt(0);

            System.out.print("Digite a cor dos cabelos (P — preto; C — castanho; L — louro; R — ruivo): ");
            char corCabelos = sc.next().charAt(0);

            if (idade > 50 && peso < 60) {
                pessoas50maisPesoMenor60++;
            }

            if (altura < 1.50) {
                somaIdadesAlturaMenor150 += idade;
                pessoasAlturaMenor150++;
            }

            if (corOlhos == 'A' || corOlhos == 'a') {
                pessoasComOlhosAzuis++;
            }

            if (corCabelos == 'R' || corCabelos == 'r' && !(corOlhos == 'A' || corOlhos == 'a')) {
                pessoasRuivasNaoAzuis++;
            }
        }

        System.out.println("Resultados:");

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + pessoas50maisPesoMenor60);

        if (pessoasAlturaMenor150 > 0) {
            double mediaIdadesAlturaMenor150 = somaIdadesAlturaMenor150 / pessoasAlturaMenor150;
            System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + mediaIdadesAlturaMenor150);
        } else {
            System.out.println("Não há pessoas com altura inferior a 1,50 m para calcular a média da idade.");
        }

        double porcentagemOlhosAzuis = (pessoasComOlhosAzuis * 100.0) / totalPessoas;
        System.out.println("Porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: " + porcentagemOlhosAzuis + "%");

        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " + pessoasRuivasNaoAzuis);
    }
}
