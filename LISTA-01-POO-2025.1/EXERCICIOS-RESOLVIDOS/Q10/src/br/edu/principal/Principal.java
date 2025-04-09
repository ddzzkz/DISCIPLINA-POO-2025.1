package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        
        double area = 3.1415 * (raio * raio);

        
        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}


