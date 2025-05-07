package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a sua primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a sua segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 * 2 + nota2 * 3) / (2 + 3);
		
		 System.out.println("A média ponderada é: " + media);
	}

}
