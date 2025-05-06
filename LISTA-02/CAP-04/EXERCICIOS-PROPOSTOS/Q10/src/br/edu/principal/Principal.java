package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	     
	        System.out.print("Digite o custo de fábrica do carro (em R$): ");
	        double custoFabrica = scanner.nextDouble();
	        
	       
	        double percentualDistribuidor;
	        double percentualImpostos;
	        
	 
	        if (custoFabrica <= 12000.00) {
	            percentualDistribuidor = 0.05; 
	            percentualImpostos = 0.0;      
	        } else if (custoFabrica >12000.00 && custoFabrica<= 25000.00) {
	            percentualDistribuidor = 0.10; 
	            percentualImpostos = 0.15;   
	        } else {
	            percentualDistribuidor = 0.15; 
	            percentualImpostos = 0.20;     
	        }
	        
	        double valorDistribuidor = custoFabrica * percentualDistribuidor;
	        double valorImpostos = custoFabrica * percentualImpostos;
	        double precoConsumidor = custoFabrica + valorDistribuidor + valorImpostos;
	        
	        System.out.printf("Preço ao consumidor: R$ %.2f\n", precoConsumidor);
	        
	        scanner.close();
	    }
	}

