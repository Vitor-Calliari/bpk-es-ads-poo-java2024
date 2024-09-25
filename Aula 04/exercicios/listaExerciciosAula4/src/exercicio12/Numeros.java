package exercicio12;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {
    private int[] numeros;

    public Numeros(int tamanho) {
        numeros = new int[tamanho];
    }

    public void lerNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite " + numeros.length + " números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    public void ordenarNumeros() {
        Arrays.sort(numeros);
    }

    public void imprimirNumeros() {
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Numeros numeros = new Numeros(5);

        numeros.lerNumeros();
        numeros.ordenarNumeros();
        numeros.imprimirNumeros();
    }
}

