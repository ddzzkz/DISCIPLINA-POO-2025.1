package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int totalPessoas = 5;
	        int maiores50 = 0;
	        double somaAlturas10a20 = 0;
	        int contagem10a20 = 0;
	        int pesoMenor40 = 0;

	        for (int i = 1; i <= totalPessoas; i++) {
	            System.out.println("Pessoa " + i + ":");
	            System.out.print("Idade: ");
	            int idade = scanner.nextInt();
	            System.out.print("Altura (m): ");
	            double altura = scanner.nextDouble();
	            System.out.print("Peso (kg): ");
	            double peso = scanner.nextDouble();

	            if (idade > 50) {
	                maiores50++;
	            }
	            if (idade >= 10 && idade <= 20) {
	                somaAlturas10a20 += altura;
	                contagem10a20++;
	            }
	            if (peso < 40) {
	                pesoMenor40++;
	            }
	        }

	        System.out.println("\nResultados:");
	        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + maiores50);

	        if (contagem10a20 > 0) {
	            double mediaAlturas10a20 = somaAlturas10a20 / contagem10a20;
	            System.out.printf("Média das alturas (10 a 20 anos): %.2f m\n", mediaAlturas10a20);
	        } else {
	            System.out.println("Média das alturas (10 a 20 anos): Nenhuma pessoa nesta faixa etária");
	        }

	        double porcentagemPesoMenor40 = (pesoMenor40 / (double) totalPessoas) * 100;
	        System.out.printf("Porcentagem de pessoas com peso inferior a 40 kg: %.2f%%\n", porcentagemPesoMenor40);

	        scanner.close();
	    }
	    }
