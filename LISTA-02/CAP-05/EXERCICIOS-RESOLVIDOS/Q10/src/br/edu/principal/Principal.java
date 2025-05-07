package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_TIMES = 5;
        final int JOGADORES_POR_TIME = 11;
        int jogadoresMenores18 = 0;
        double somaAlturas = 0.0;
        int jogadoresMais80kg = 0;
        int totalJogadores = NUM_TIMES * JOGADORES_POR_TIME;
        
  
        double[] somaIdadesPorTime = new double[NUM_TIMES];
        
   
        for (int i = 0; i < NUM_TIMES; i++) {
            System.out.println("Time " + (i + 1) + ":");
            
         
            for (int j = 0; j < JOGADORES_POR_TIME; j++) {
                System.out.println("Jogador " + (j + 1) + ":");
                
             
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                somaIdadesPorTime[i] += idade;
                if (idade < 18) {
                    jogadoresMenores18++;
                }
                
            
                System.out.print("Peso (kg): ");
                double peso = scanner.nextDouble();
                if (peso > 80) {
                    jogadoresMais80kg++;
                }
                
  
                System.out.print("Altura (m): ");
                double altura = scanner.nextDouble();
                somaAlturas += altura;
            }
        }
        

        System.out.println("\nResultados:");
        System.out.println("Quantidade de jogadores com menos de 18 anos: " + jogadoresMenores18);
        

        System.out.println("Média das idades por time:");
        for (int i = 0; i < NUM_TIMES; i++) {
            double mediaIdades = somaIdadesPorTime[i] / JOGADORES_POR_TIME;
            System.out.printf("Time %d: %.2f anos%n", (i + 1), mediaIdades);
        }
        
        double mediaAlturas = somaAlturas / totalJogadores;
        System.out.printf("Média das alturas de todos os jogadores: %.2f m%n", mediaAlturas);
        
        double porcentagemMais80kg = (jogadoresMais80kg * 100.0) / totalJogadores;
        System.out.printf("Porcentagem de jogadores com mais de 80 kg: %.2f%%%n", porcentagemMais80kg);
        
        scanner.close();
    }
}
