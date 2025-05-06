package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero, i, j, contador_divisores;
        int soma_pares = 0;
        int soma_primos = 0;

        for (i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numero = sc.nextInt();

            if (numero % 2 == 0) {
                soma_pares += numero;
            }

            contador_divisores = 0;
            for (j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    contador_divisores++;
                }
            }

            if (contador_divisores == 2) {
                soma_primos += numero;
            }
        }

        System.out.println("Soma dos números pares: " + soma_pares);
        System.out.println("Soma dos números primos: " + soma_primos);
    }
}
