package br.edu.principal;
import java.util.Scanner;
public class Principal {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        

	        System.out.print("Digite o saldo médio do cliente (em R$): ");
	        double saldoMedio = scanner.nextDouble();
	        

	        double percentualCredito;
	        if (saldoMedio > 400.00) {
	            percentualCredito = 0.30;
	        } else if (saldoMedio < 400.00 && saldoMedio > 300.00) {
	            percentualCredito = 0.25; 
	        } else if (saldoMedio < 300.00 && saldoMedio > 200.00) {
	            percentualCredito = 0.20; 
	        } else {
	            percentualCredito = 0.10; 
	        }
	        
	        double valorCredito = saldoMedio * percentualCredito;
	        
	        
	        System.out.printf("Saldo médio: R$ %.2f\n", saldoMedio);
	        System.out.printf("Valor do crédito: R$ %.2f\n", valorCredito);
	        
	        scanner.close();
	    }
	}

