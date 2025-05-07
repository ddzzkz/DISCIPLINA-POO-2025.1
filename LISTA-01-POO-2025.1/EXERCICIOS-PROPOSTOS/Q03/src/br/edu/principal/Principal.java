package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite um número diferente de 0: ");
		int num2 = sc.nextInt();
		
		if (num2 != 0) {
			int resu = num1 / num2;
			
			System.out.println("Resultado da divisão: " + resu);
		}
		else {
			System.out.println("O numero que você colocou é zero!");
		}
		
	}

}
