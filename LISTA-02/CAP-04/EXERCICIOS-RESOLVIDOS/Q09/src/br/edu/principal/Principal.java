package br.edu.principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, ano, hora, min;

        System.out.print("Digite o dia: ");
        dia = sc.nextInt();
        System.out.print("Digite o mês: ");
        mes = sc.nextInt();
        System.out.print("Digite o ano: ");
        ano = sc.nextInt();
        
        System.out.print("Data Atual: " + dia + "/" + mes + "/" + ano + " – ");

        if (mes == 1) {
            System.out.println("janeiro");
        } else if (mes == 2) {
            System.out.println("fevereiro");
        } else if (mes == 3) {
            System.out.println("março");
        } else if (mes == 4) {
            System.out.println("abril");
        } else if (mes == 5) {
            System.out.println("maio");
        } else if (mes == 6) {
            System.out.println("junho");
        } else if (mes == 7) {
            System.out.println("julho");
        } else if (mes == 8) {
            System.out.println("agosto");
        } else if (mes == 9) {
            System.out.println("setembro");
        } else if (mes == 10) {
            System.out.println("outubro");
        } else if (mes == 11) {
            System.out.println("novembro");
        } else if (mes == 12) {
            System.out.println("dezembro");
        } else {
            System.out.println("Mês inválido!");
            return;
        }

        System.out.print("Digite a hora: ");
        hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        min = sc.nextInt();

        System.out.println("Hora Atual: " + (hora < 10 ? "0" + hora : hora) + ":" + (min < 10 ? "0" + min : min));
    }
}
