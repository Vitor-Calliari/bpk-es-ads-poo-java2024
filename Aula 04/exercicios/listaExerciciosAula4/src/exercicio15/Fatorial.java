package exercicio15;

import java.util.Scanner;

public class Fatorial {
    private int numero;

    public Fatorial(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int calcularFatorialIterativo() {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public int calcularFatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calcularFatorialRecursivo(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        Fatorial fatorial = new Fatorial(numero);

        int resultadoIterativo = fatorial.calcularFatorialIterativo();
        int resultadoRecursivo = fatorial.calcularFatorialRecursivo(numero);

        System.out.println("Fatorial de " + numero + " (Iterativo): " + resultadoIterativo);
        System.out.println("Fatorial de " + numero + " (Recursivo): " + resultadoRecursivo);

        scanner.close();
    }
}
