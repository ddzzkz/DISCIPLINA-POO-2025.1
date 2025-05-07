package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double nota1, nota2, nota3, media, peso1, peso2, peso3;
		
		System.out.print("Digite a Primeria nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite o peso dessa nota: ");
		peso1 = sc.nextDouble();
		
		System.out.print("Digite a Segunda nota: ");
		nota2 = sc.nextDouble();
		
		System.out.print("Digite o peso dessa nota: ");
		peso2 = sc.nextDouble();
		
		System.out.print("Digite a Terceira nota: ");
		nota3 = sc.nextDouble();
		
		System.out.print("Digite o peso dessa nota: ");
		peso3 = sc.nextDouble();
		
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
		
		System.out.println("A sua media é: " + media);
	}

}
