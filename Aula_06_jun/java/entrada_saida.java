import java.util.Scanner;

public class entrada_saida {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("agora digite sua idade:");
        int idade = leitor.nextInt();

        System.out.println();
        System.out.printf("Olá, %s! Fico feliz em saber que você tem %d anos.%n", nome, idade);

        leitor.close();
    }
}