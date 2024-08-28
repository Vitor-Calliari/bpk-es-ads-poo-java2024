package exercicio09;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a operação desejada: ");
        int operacao = scanner.nextInt();

        double resultado;

        switch(operacao){
            case 1:
                resultado = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println(num1 + " x " + num2 + " = " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }
    }
}
