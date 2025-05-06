package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor, total_vista = 0, total_prazo = 0;
        String codigo;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Transação " + i + " - Código (V para à vista / P para a prazo): ");
            codigo = sc.next();
            
            System.out.print("Digite o valor da transação: R$ ");
            valor = sc.nextDouble();

            switch (codigo) {
            case "V":
            case "v":
                total_vista += valor;
                break;
            case "P":
            case "p":
                total_prazo += valor;
                break;
            default:
                System.out.println("Código inválido. Ignorando transação.");

            System.out.println("---------");
        }
            }

        double total_geral = total_vista + total_prazo;
        double primeira_parcela = total_prazo / 3;

        System.out.println("------ RELATÓRIO FINAL ------");
        System.out.println("Total das compras à vista: R$ " + total_vista);
        System.out.println("Total das compras a prazo: R$ " + total_prazo);
        System.out.println("Total geral das compras: R$ " + total_geral);
        System.out.println("Valor da 1ª prestação das compras a prazo: R$ " + primeira_parcela);

    
    }
}
