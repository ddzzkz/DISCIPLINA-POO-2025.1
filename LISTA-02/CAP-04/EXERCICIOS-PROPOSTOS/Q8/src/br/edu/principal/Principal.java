package br.edu.principal;
import java.util.Scanner;
public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	  
	        System.out.print("Digite o salário do funcionário (em R$): ");
	        double salario = scanner.nextDouble();
	        
	
	        double percentualAumento;
	        if (salario <= 300.00) {
	            percentualAumento = 0.35; 
	        } else {
	            percentualAumento = 0.15; 
	        }
	        
	        double salarioReajustado = salario * (1 + percentualAumento);
	        
	    
	        System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);
	        
	        scanner.close();
	    }
	}

