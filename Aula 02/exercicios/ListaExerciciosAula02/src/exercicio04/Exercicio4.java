package exercicio04;

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        if(num1 % 2 == 0){
            System.out.println("O número digitado é par");
        }else {
            System.out.println("O número digitado é ímpar");
        }
    }
}
