package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, res;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		System.out.println("TABUADA DO " + num + ": ");
		  
		for (int i = 0; i <= 10; i++) {
	            res = num * i;
	            System.out.println(num + " × " + i + " = " + res);
	}
		}

}
