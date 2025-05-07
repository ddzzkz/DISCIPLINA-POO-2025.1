package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 6;
        int maiores50PesoMenor60 = 0;
        double somaIdadesAlturaMenor150 = 0;
        int contagemAlturaMenor150 = 0;
        int olhosAzuis = 0;
        int ruivasNaoOlhosAzuis = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Altura (m): ");
            double altura = scanner.nextDouble();
            System.out.print("Cor dos olhos (A/P/V/C): ");
            char olhos = scanner.next().toUpperCase().charAt(0);
            System.out.print("Cor dos cabelos (P/C/L/R): ");
            char cabelos = scanner.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) {
                maiores50PesoMenor60++;
            }
            if (altura < 1.50) {
                somaIdadesAlturaMenor150 += idade;
                contagemAlturaMenor150++;
            }
            if (olhos == 'A') {
                olhosAzuis++;
            }
            if (cabelos == 'R' && olhos != 'A') {
                ruivasNaoOlhosAzuis++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Quantidade de pessoas com idade > 50 anos e peso < 60 kg: " + maiores50PesoMenor60);

        if (contagemAlturaMenor150 > 0) {
            double mediaIdadesAlturaMenor150 = somaIdadesAlturaMenor150 / contagemAlturaMenor150;
            System.out.printf("Média das idades (altura < 1,50 m): %.2f anos\n", mediaIdadesAlturaMenor150);
        } else {
            System.out.println("Média das idades (altura < 1,50 m): Nenhuma pessoa com altura inferior a 1,50 m");
        }

        double porcentagemOlhosAzuis = (olhosAzuis / (double) totalPessoas) * 100;
        System.out.printf("Porcentagem de pessoas com olhos azuis: %.2f%%\n", porcentagemOlhosAzuis);

        System.out.println("Quantidade de pessoas ruivas sem olhos azuis: " + ruivasNaoOlhosAzuis);

        scanner.close();
    }
}
