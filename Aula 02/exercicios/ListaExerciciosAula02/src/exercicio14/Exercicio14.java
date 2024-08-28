package exercicio14;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = scanner.nextLine();

        int numeroVogais = contarVogais(input);

        System.out.println("Número de vogais na palavra: " + numeroVogais);

        scanner.close();
    }

    public static int contarVogais(String str) {
        int contagem = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vogais.indexOf(str.charAt(i)) != -1) {
                contagem++;
            }
        }

        return contagem;
    }
}
