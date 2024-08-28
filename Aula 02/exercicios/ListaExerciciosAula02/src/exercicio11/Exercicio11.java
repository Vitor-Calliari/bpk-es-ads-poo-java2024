package exercicio11;
import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra é um palíndromo.");
        } else {
            System.out.println("A palavra não é um palíndromo.");
        }

        scanner.close();
    }

    public static boolean ehPalindromo(String palavra) {
        int n = palavra.length();
        for (int i = 0; i < n / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
