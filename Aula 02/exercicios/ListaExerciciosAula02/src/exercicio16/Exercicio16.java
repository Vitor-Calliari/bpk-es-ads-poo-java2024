package exercicio16;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a conversão de temperatura:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int opcao = scanner.nextInt();

        double temperaturaConvertida;
        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                temperaturaConvertida = celsiusParaFahrenheit(celsius);
                System.out.println(celsius + " °C = " + temperaturaConvertida + " °F");
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                temperaturaConvertida = fahrenheitParaCelsius(fahrenheit);
                System.out.println(fahrenheit + " °F = " + temperaturaConvertida + " °C");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
        scanner.close();
    }
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}

