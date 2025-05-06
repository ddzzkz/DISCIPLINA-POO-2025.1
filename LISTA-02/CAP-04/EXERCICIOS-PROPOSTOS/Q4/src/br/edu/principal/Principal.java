package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();
	        
	        System.out.print("Digite o segundo número: ");
	        double numero2 = scanner.nextDouble();
	        
	        System.out.print("Digite o terceiro número: ");
	        double numero3 = scanner.nextDouble();
	        
	        if (numero1 > numero2 & numero1 > numero3) {
	            System.out.println("O maior número é: " + numero1);
	        } else { 
	        	if (numero1 < numero2 & numero2 > numero3) {
	            System.out.println("O maior número é: " + numero2);
	        }else{
	        	 System.out.println("O maior número é: " + numero3);
	        }
	        
	        
	        scanner.close();
	        }
	    }
	}

