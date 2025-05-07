package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int num1, num2, num3, num4, soma;
		
		System.out.print("Digite o primerio número: ");
		num1 = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();

		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextInt();
		System.out.print("Digite o quarto número: ");
		num4 = sc.nextInt();
		
		soma = num1 + num2 + num3 + num4;
				
		System.out.println("A soma dos números é: " + soma);
	}

}
