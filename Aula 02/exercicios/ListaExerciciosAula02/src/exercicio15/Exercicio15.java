package exercicio15;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorialIterativo = calcularFatorialIterativo(numero);
        System.out.println("Fatorial (Iterativo) de " + numero + " é: " + fatorialIterativo);

        long fatorialRecursivo = calcularFatorialRecursivo(numero);
        System.out.println("Fatorial (Recursivo) de " + numero + " é: " + fatorialRecursivo);

        scanner.close();
    }

    public static long calcularFatorialIterativo(int n) {
        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static long calcularFatorialRecursivo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorialRecursivo(n - 1);
        }
    }
}
