import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Qual sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Qual sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("\nSeu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);

        scanner.close();
    }
}
