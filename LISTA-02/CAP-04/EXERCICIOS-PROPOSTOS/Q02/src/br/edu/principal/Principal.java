package br.edu.principal;
	import java.util.Scanner;

	public class Principal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();
	        
	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();
	      	        
	        double media = (nota1 + nota2) / 2;
	        
	        System.out.printf("Média: %.2f\n", media);
	        
	        if (media <=3 ) {
	            System.out.println("Situação: Reprovado");
	        } else {	        if (media >7 ) {
	            System.out.println("Situação: Aprovado");
	        } else{
	        	System.out.println("Situação: Exame");
	        }
	        
	        scanner.close();
	    }
	}

}
