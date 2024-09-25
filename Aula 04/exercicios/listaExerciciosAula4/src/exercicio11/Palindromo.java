package exercicio11;

import java.util.Scanner;

public class Palindromo {
    private String texto;

    public Palindromo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean ehPalindromo() {
        String palavra = texto.toLowerCase();
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra para verificar se é um palíndromo: ");
        String palavra = scanner.nextLine();

        Palindromo p = new Palindromo(palavra);

        if (p.ehPalindromo()) {
            System.out.println(p.getTexto() + " é um palíndromo.");
        } else {
            System.out.println(p.getTexto() + " não é um palíndromo.");
        }

        scanner.close();
    }
}
