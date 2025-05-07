package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario, aumento, novoSalario;
		
		System.out.print("Digite seu Salario: R$ ");
		salario = sc.nextDouble();
		
		aumento = salario * 0.25;
		
		novoSalario = salario + aumento;
		
		System.out.println("Seu novo salario é: R$ " + novoSalario);

	}

}
