package exercicio13;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    private int numeroParaAdivinhar;
    private int tentativas;

    public JogoAdivinhacao() {
        Random random = new Random();
        numeroParaAdivinhar = random.nextInt(100) + 1;
    }

    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int palpite = 0;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        while (palpite != numeroParaAdivinhar) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroParaAdivinhar) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroParaAdivinhar) {
                System.out.println("Muito alto! Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você adivinhou o número " + numeroParaAdivinhar + " em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();
        jogo.jogar();
    }
}

