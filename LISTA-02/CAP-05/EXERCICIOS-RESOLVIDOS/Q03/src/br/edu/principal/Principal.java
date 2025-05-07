package br.edu.principal;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] faixas = new int[5]; 
        int totalPessoas = 8;

        System.out.println("Digite a idade de " + totalPessoas + " pessoas:");
        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

           
            if (idade <= 15) {
                faixas[0]++;
            } else if (idade <= 30) {
                faixas[1]++; 
            } else if (idade <= 45) {
                faixas[2]++;
            } else if (idade <= 60) {
                faixas[3]++; 
            } else {
                faixas[4]++; 
            }
        }

        System.out.println("\nQuantidade de pessoas por faixa etária:");
        System.out.println("1ª faixa (até 15 anos): " + faixas[0] + " pessoas");
        System.out.println("2ª faixa (16 a 30 anos): " + faixas[1] + " pessoas");
        System.out.println("3ª faixa (31 a 45 anos): " + faixas[2] + " pessoas");
        System.out.println("4ª faixa (46 a 60 anos): " + faixas[3] + " pessoas");
        System.out.println("5ª faixa (acima de 60 anos): " + faixas[4] + " pessoas");

        double porcentagemPrimeira = (faixas[0] / (double) totalPessoas) * 100;
        System.out.printf("\nPorcentagem da 1ª faixa (até 15 anos): %.2f%%\n", porcentagemPrimeira);

        double porcentagemUltima = (faixas[4] / (double) totalPessoas) * 100;
        System.out.printf("Porcentagem da 5ª faixa (acima de 60 anos): %.2f%%\n", porcentagemUltima);

        scanner.close();
    }
}
