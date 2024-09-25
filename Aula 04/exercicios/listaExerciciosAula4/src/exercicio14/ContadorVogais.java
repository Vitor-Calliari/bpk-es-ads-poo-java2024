package exercicio14;
import java.util.Scanner;

public class ContadorVogais {
    private String texto;

    // Construtor
    public ContadorVogais(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int contarVogais() {
        int contador = 0;
        String vogais = "aeiouAEIOU";

        for (int i = 0; i < texto.length(); i++) {
            if (vogais.indexOf(texto.charAt(i)) != -1) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para contar o número de vogais: ");
        String entrada = scanner.nextLine();

        ContadorVogais contador = new ContadorVogais(entrada);

        int numeroDeVogais = contador.contarVogais();
        System.out.println("Número de vogais na string: " + numeroDeVogais);

        scanner.close();
    }
}

