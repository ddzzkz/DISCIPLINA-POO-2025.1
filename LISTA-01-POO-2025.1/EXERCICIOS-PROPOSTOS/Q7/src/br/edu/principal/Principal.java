package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o peso da pessoa (em kg): ");
        double peso = scanner.nextDouble();

        
        double pesoEngordar = peso + (peso * 15 / 100);
        double pesoEmagrecer = peso - (peso * 20 / 100);

        
        System.out.printf("Se engordar 15%%, o novo peso será: %.2f kg%n", pesoEngordar);
        System.out.printf("Se emagrecer 20%%, o novo peso será: %.2f kg%n", pesoEmagrecer);

        scanner.close();
    }
}