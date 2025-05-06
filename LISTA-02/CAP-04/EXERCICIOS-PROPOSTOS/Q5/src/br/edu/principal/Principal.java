package br.edu.principal;
import java.util.Scanner;

public class Principal {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Digite o primeiro número: ");
	        double numero1 = scanner.nextDouble();
	        
	        System.out.print("Digite o segundo número: ");
	        double numero2 = scanner.nextDouble();
	        
	     
	        System.out.println("\nEscolha uma operação:");
	        System.out.println("1 - Média entre os números");
	        System.out.println("2 - Diferença do maior pelo menor");
	        System.out.println("3 - Produto entre os números");
	        System.out.println("4 - Divisão do primeiro pelo segundo");
	        System.out.print("Digite sua escolha (1-4): ");
	        int opcao = scanner.nextInt();
	        
	   
	        switch (opcao) {
	            case 1:
	                double media = (numero1 + numero2) / 2;
	                System.out.printf("Média: %.2f\n", media);
	                break;
	                
	            case 2:
	                double diferenca = numero1 > numero2 ? numero1 - numero2 : numero2 - numero1;
	                System.out.printf("Diferença do maior pelo menor: %.2f\n", diferenca);
	                break;
	                
	            case 3:
	                double produto = numero1 * numero2;
	                System.out.printf("Produto: %.2f\n", produto);
	                break;
	                
	            case 4:
	                if (numero2 != 0) {
	                    double divisao = numero1 / numero2;
	                    System.out.printf("Divisão: %.2f\n", divisao);
	                } else {
	                    System.out.println("Erro: Divisão por zero não é permitida!");
	                    scanner.close();
	                    return; 
	                }
	                break;
	                
	            default:
	                System.out.println("Erro: Opção inválida! Escolha um número entre 1 e 4.");
	                scanner.close();
	                return; 
	        }
	        
	        scanner.close();
	    }
	}