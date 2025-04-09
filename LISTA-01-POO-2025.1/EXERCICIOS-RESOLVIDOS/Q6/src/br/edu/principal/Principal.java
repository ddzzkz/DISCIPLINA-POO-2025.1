package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário base: ");
        double sal = scanner.nextDouble();

        
        double grat = sal * 5 / 100;
        double imp = sal * 7 / 100;
        double salreceber = sal + grat - imp;

        
        System.out.printf("O salário a receber é: R$ %.2f\n", salreceber);

        scanner.close();
    }
}