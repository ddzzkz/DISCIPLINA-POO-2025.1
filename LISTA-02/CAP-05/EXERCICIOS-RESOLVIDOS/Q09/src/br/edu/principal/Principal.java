package br.edu.principal;
import java.util.Scanner;
public class Principal {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int NUM_ALUNOS = 6;
        double somaMedias = 0.0;
        int aprovados = 0;
        int exame = 0;
        int reprovados = 0;
        
    
        for (int i = 0; i < NUM_ALUNOS; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            
     
            System.out.print("Primeira nota: ");
            double nota1 = scanner.nextDouble();
            System.out.print("Segunda nota: ");
            double nota2 = scanner.nextDouble();
            

            double media = (nota1 + nota2) / 2.0;
            somaMedias += media;
            
         
            String mensagem;
            if (media >= 7) {
                mensagem = "Aprovado";
                aprovados++;
            } else if (media >= 3) {
                mensagem = "Exame";
                exame++;
            } else {
                mensagem = "Reprovado";
                reprovados++;
            }
            
        
            System.out.printf("Média: %.2f - %s%n", media, mensagem);
        }
        
      
        double mediaClasse = somaMedias / NUM_ALUNOS;
        System.out.println("\nResultados gerais:");
        System.out.println("Total de alunos aprovados: " + aprovados);
        System.out.println("Total de alunos em exame: " + exame);
        System.out.println("Total de alunos reprovados: " + reprovados);
        System.out.printf("Média da classe: %.2f%n", mediaClasse);
        
        scanner.close();
    }
}
