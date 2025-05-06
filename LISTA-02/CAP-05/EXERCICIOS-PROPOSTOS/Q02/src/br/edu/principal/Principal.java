package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double maior_lucro = 0, preco, lucro = 0;
		int ingressos, ingre_maximo = 0;
		double preco_maximo = 0;
		
		System.out.println("|------------------------------------------|");
		System.out.println("|   INGRESSOS   |    PREÇO    |   LUCROS   |");
		System.out.println("|------------------------------------------|");
		
		for (preco = 5.00; preco >= 1.00; preco -= 0.50) {
            ingressos = (int)(120 + ((5.00 - preco) / 0.50) * 26);

            double res = preco * ingressos;
            lucro = res - 200;

        System.out.println("|      " + ingressos + "      |    R$ " + preco + "   | R$ " + lucro +"   |");
        System.out.println("|------------------------------------------|");
            if (lucro > maior_lucro) {
            	maior_lucro = lucro;
            	preco_maximo = preco;
            	ingre_maximo = ingressos;
            }
           }
            System.out.println(" ");
            System.out.println("| Lucro Máximo Esperado ");
            System.out.println("| Preço do ingresso: R$ " + preco_maximo);
            System.out.println("| Ingressos vendidos: " + ingre_maximo);
            System.out.println("| Lucro: R$ " + maior_lucro);
	}
}


