package exercicio10;
import java.util.Scanner;


public class NumeroPrimo {
    private int valor;

    public NumeroPrimo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean ehPrimo() {
        if (valor <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(valor); i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        // Cria uma instância de Numero
        NumeroPrimo num = new NumeroPrimo(numero);

        // Verifica se o número é primo e exibe o resultado
        if (num.ehPrimo()) {
            System.out.println(num.getValor() + " é um número primo.");
        } else {
            System.out.println(num.getValor() + " não é um número primo.");
        }

        scanner.close();
    }
}
