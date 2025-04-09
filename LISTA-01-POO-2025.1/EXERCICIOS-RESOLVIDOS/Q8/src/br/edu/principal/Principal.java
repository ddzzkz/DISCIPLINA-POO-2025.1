package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do depósito: ");
        double dep = scanner.nextDouble();
        System.out.print("Digite o valor da taxa de juros (em %): ");
        double taxa = scanner.nextDouble();

        
        double rend = dep * taxa / 100;
        double total = dep + rend;

        
        System.out.println("Valor do rendimento: R$ " + rend);
        System.out.println("Valor total após o rendimento: R$ " + total);

        scanner.close();
    }
}