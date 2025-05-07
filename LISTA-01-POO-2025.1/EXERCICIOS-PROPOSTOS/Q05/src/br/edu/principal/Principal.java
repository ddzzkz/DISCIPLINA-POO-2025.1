package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o preço do produto: R$ ");
		double preco = sc.nextDouble();
		
		double desconto = preco * 0.10;
		
		double PrecoNovo = preco - desconto;
		
		System.out.println("O novo preço é: R$ " + PrecoNovo);

	}

}
