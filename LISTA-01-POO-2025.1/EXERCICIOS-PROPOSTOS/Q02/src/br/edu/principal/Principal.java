package br.edu.principl;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = sc.nextInt();
		
		System.out.print("Digite outro número: ");
		int num3 = sc.nextInt();
		
		int resu = num1 * num2 * num3;
		
		System.out.println("Resultado da Multiplicação: " + resu);

	}

}
