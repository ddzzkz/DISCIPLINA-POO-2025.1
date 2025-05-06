package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;

		 for (int i = 1; i <= 8; i++) {
			 System.out.print("Digite a idade " + i + ": ");
			 idade = sc.nextInt();
			 
			 if (idade <= 15) {
				 faixa1++;
			 }
			 else if (idade <= 30) {
				 faixa2++;
			 }
			 else if (idade <= 45) {
				 faixa3++;
			 }
			 else if (idade <= 60) {
				 faixa4++;
			 }
			 else {
				 faixa5++;
			 }
			}
			 
			 int total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
			 double por_faixa1 = (faixa1 * 100.0) / total;
			 double por_faixa5 = (faixa5 * 100.0) / total;
			 
			 System.out.println("Quantidade das Faixas Etarias!");
			 System.out.println("- Até 15 anos: " + faixa1);
		     System.out.println("- De 16 a 30 anos: " + faixa2);
		     System.out.println("- De 31 a 45 anos: " + faixa3);
		     System.out.println("- De 46 a 60 anos: " + faixa4);
		     System.out.println("- Acima de 60 anos: " + faixa5);
		     
		     System.out.println("Porcentagem na 1ª faixa (até 15 anos): " + por_faixa1);
		     System.out.println("Porcentagem na 5ª faixa (acima de 60 anos): " + por_faixa5);
		
	}

}
