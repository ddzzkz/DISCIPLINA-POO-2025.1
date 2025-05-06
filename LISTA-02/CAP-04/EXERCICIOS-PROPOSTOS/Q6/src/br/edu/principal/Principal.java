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
	        System.out.println("a - Primeiro número elevado ao segundo");
	        System.out.println("b - Raiz quadrada de cada número");
	        System.out.println("c - Raiz cúbica de cada número");
	        System.out.print("Digite sua escolha (a, b ou c): ");
	        char opcao = scanner.next().charAt(0);
	        
	 
	        switch (opcao) {
	            case 'a':
	            case 'A':
	                double potencia = Math.pow(numero1, numero2);
	                System.out.printf("Resultado: %.2f elevado a %.2f = %.2f\n", numero1, numero2, potencia);
	                break;
	                
	            case 'b':
	            case 'B':
	                if (numero1 >= 0 && numero2 >= 0) {
	                    double raiz1 = Math.sqrt(numero1);
	                    double raiz2 = Math.sqrt(numero2);
	                    System.out.printf("Raiz quadrada de %.2f = %.2f\n", numero1, raiz1);
	                    System.out.printf("Raiz quadrada de %.2f = %.2f\n", numero2, raiz2);
	                } else {
	                    System.out.println("Erro: Não é possível calcular raiz quadrada de número negativo!");
	                    scanner.close();
	                    return;
	                }
	                break;
	                
	            case 'c':
	            case 'C':
	                double raizCubica1 = Math.cbrt(numero1);
	                double raizCubica2 = Math.cbrt(numero2);
	                System.out.printf("Raiz cúbica de %.2f = %.2f\n", numero1, raizCubica1);
	                System.out.printf("Raiz cúbica de %.2f = %.2f\n", numero2, raizCubica2);
	                break;
	                
	            default:
	                System.out.println("Erro: Opção inválida! Escolha a, b ou c.");
	                scanner.close();
	                return;
	        }
	        
	        scanner.close();
	    }
	}

