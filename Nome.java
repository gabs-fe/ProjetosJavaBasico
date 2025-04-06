import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é: " + nome);

        scanner.close();
    }
}
