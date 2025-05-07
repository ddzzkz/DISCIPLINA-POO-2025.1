package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario, perc, aumento, novoSalario;
		
		System.out.print("Digite seu Salario: R$ ");
		salario = sc.nextDouble();
		
		System.out.print("Digite a percentual do aumento: ");
		perc = sc.nextDouble();
	
		aumento = salario * (perc / 100);
		
		novoSalario = salario + aumento;
		
		System.out.println("Seu novo salario é: R$ " + novoSalario);

		

	}

}
