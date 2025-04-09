package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = scanner.nextDouble();
        System.out.print("Digite o valor total das vendas: ");
        double vendas = scanner.nextDouble();

        
        double comissao = vendas * 4 / 100;
        double salarioFinal = salarioFixo + comissao;

        
        System.out.println("Comissão sobre as vendas: R$ " + comissao);
        System.out.println("Salário final do funcionário: R$ " + salarioFinal);

        scanner.close();
    }
}