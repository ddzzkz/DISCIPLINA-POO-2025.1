package br.edu.principal;

public class Principal {
	 public static void main(String[] args) {
	        double lucroMaximo = Double.NEGATIVE_INFINITY;
	        double precoMaximo = 0;
	        int ingressosMaximo = 0;

	        System.out.printf("%-15s %-15s %-15s %-15s%n", "Preço (R$)", "Ingressos", "Receita (R$)", "Lucro (R$)");
	        System.out.println("------------------------------------------------------------");

	        for (double preco = 5.00; preco >= 1.00; preco -= 0.50) {
	            int n = (int) Math.round((5.00 - preco) / 0.50);
	            int ingressos = 120 + 26 * n;
	            double receita = preco * ingressos;
	            double lucro = receita - 200.00;

	            
	            System.out.printf("%-15.2f %-15d %-15.2f %-15.2f%n", preco, ingressos, receita, lucro);

	           
	            if (lucro > lucroMaximo) {
	                lucroMaximo = lucro;
	                precoMaximo = preco;
	                ingressosMaximo = ingressos;
	            }
	        }

	        
	        System.out.println("\nLucro máximo esperado:");
	        System.out.printf("Lucro: R$ %.2f%n", lucroMaximo);
	        System.out.printf("Preço do ingresso: R$ %.2f%n", precoMaximo);
	        System.out.printf("Quantidade de ingressos: %d%n", ingressosMaximo);
	    }
}
