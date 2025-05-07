package br.edu.principal;
import java.util.Scanner;

public class Principal {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double totalVista = 0, totalPrazo = 0;
	        int numTransacoes = 15;

	        for (int i = 1; i <= numTransacoes; i++) {
	            System.out.print("Transação " + i + " - Código (V/P): ");
	            char codigo = scanner.next().toUpperCase().charAt(0);
	            System.out.print("Transação " + i + " - Valor: R$ ");
	            double valor = scanner.nextDouble();

	            if (codigo == 'V') {
	                totalVista += valor;
	            } else if (codigo == 'P') {
	                totalPrazo += valor;
	            }
	        }

	        double totalGeral = totalVista + totalPrazo;
	        double primeiraPrestacao = totalPrazo / 3;

	        System.out.printf("\nValor total das compras à vista: R$ %.2f\n", totalVista);
	        System.out.printf("Valor total das compras a prazo: R$ %.2f\n", totalPrazo);
	        System.out.printf("Valor total das compras: R$ %.2f\n", totalGeral);
	        System.out.printf("Valor da primeira prestação das compras a prazo: R$ %.2f\n", primeiraPrestacao);

	        scanner.close();
	    }
}
