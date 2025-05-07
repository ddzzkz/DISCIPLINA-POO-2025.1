package br.edu.principal;
import java.util.Scanner;

public class Principal {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double[][] grupos = new double[5][4]; 
	        
	        
	        System.out.println("Digite os cinco grupos de quatro valores (A, B, C, D):");
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Grupo " + (i + 1) + ":");
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Valor " + (j + 1) + ": ");
	                grupos[i][j] = scanner.nextDouble();
	            }
	        }
	        
	        
	        System.out.println("\nValores na ordem lida:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Grupo " + (i + 1) + ": ");
	            for (int j = 0; j < 4; j++) {
	                System.out.print(grupos[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        
	        for (int i = 0; i < 5; i++) {
	            
	            double[] grupo = new double[4];
	            for (int j = 0; j < 4; j++) {
	                grupo[j] = grupos[i][j];
	            }
	            
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3 - j; k++) {
	                    if (grupo[k] > grupo[k + 1]) {
	                        double temp = grupo[k];
	                        grupo[k] = grupo[k + 1];
	                        grupo[k + 1] = temp;
	                    }
	                }
	            }
	            
	            
	            System.out.print("\nGrupo " + (i + 1) + " (crescente): ");
	            for (double valor : grupo) {
	                System.out.print(valor + " ");
	            }
	            
	            
	            System.out.print("\nGrupo " + (i + 1) + " (decrescente): ");
	            for (int j = 3; j >= 0; j--) {
	                System.out.print(grupo[j] + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}

