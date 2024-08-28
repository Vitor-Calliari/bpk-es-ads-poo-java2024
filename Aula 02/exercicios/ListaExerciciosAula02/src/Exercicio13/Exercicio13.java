package Exercicio13;
import java.util.Random;
import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroEscolhido = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite = 0;

        System.out.println("Bem-vindo ao jogo");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroEscolhido) {
            System.out.print("Digite um número: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroEscolhido) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroEscolhido) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Você precisou de " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}
