package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Digite o salário do funcionário (em R$): ");
	        double salario = scanner.nextDouble();

	        if (salario < 500.00) {
	            double salarioReajustado = salario * 1.30; 
	            System.out.printf("Salário reajustado: R$ %.2f\n", salarioReajustado);
	        } else {
	            System.out.println("Este funcionário não tem direito ao aumento.");
	        }
	        
	        scanner.close();
	    }
	}

