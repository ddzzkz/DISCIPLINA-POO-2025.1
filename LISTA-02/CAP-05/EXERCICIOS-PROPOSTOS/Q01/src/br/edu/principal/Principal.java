package br.eu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		int a, b, c, d, grupo, ordem;
		
		 for (grupo = 1; grupo <= 5; grupo++) {
			System.out.println("Digite os 4 valores do grupo " + grupo + ":");
			
			System.out.print("Digite o Primeiro valor: ");
			a = sc.nextInt();
			
			System.out.print("Digite o Segundo valor: ");
			b = sc.nextInt();
			
			System.out.print("Digite o Terceiro valor: ");
			c = sc.nextInt();
			
			System.out.print("Digite o Quarto valor: ");
			d = sc.nextInt();
			
			System.out.println("Grupo " + grupo + " na ordem lida: " + a + " - " + b + " - " + c + " - " + d);
			
			if (a > b) {
                ordem = a; a = b; b = ordem ;
            } if (a > c) {
            	ordem  = a; a = c; c = ordem ;
            } if (a > d) {
            	ordem  = a; a = d; d = ordem ;
            } if (b > c) {
            	ordem  = b; b = c; c = ordem ;
            } if (b > d) {
            	ordem  = b; b = d; d = ordem ;
            } if (c > d) {
            	ordem  = c; c = d; d = ordem ;
            }
            System.out.println("A ordem Crescente é : " + a + " - " + b + " - " + c + " - " + d);
			System.out.println("A ordem decrescente é : " + d + " - " + c + " - " + b + " - " + a);
		}
	}
}


