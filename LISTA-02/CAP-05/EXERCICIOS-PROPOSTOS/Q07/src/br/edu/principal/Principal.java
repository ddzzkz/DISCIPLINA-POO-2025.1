package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		  int idade;
	        double altura, peso;
	        double soma_alturas = 0, somaP_Inf40 = 0;
	        int total_pessoas50_mais = 0, pessoas10a20 = 0;
	        
	        
	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Pessoa " + i + ":");
	            
	            
	            System.out.print("Digite a idade: ");
	            idade = sc.nextInt();
	            System.out.print("Digite a altura: ");
	            altura = sc.nextDouble();
	            System.out.print("Digite o peso: ");
	            peso = sc.nextDouble();
	            
	            
	            if (idade > 50) {
	            	total_pessoas50_mais++;
	            }
	            
	            if (idade >= 10 && idade <= 20) {
	                soma_alturas += altura;
	                pessoas10a20++;
	            }
	            
	            if (peso < 40) {
	            	somaP_Inf40++;
	            }
	        }
	        
	        System.out.println("Resultados:");
	        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + total_pessoas50_mais);
	        
	        if (pessoas10a20 > 0) {
	            double media_alturas = soma_alturas / pessoas10a20;
	            System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + media_alturas);
	        } else {
	            System.out.println("Não há pessoas com idade entre 10 e 20 anos para calcular a média da altura.");
	        }
	        
	        double por_menos40kg = (somaP_Inf40 * 100.0) / 5;
	        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + por_menos40kg + "%");
	    }
	}