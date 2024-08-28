package exercicio06;

public class TesteComputador {
    public static void main(String[] args){
        Computador computador = new Computador("intel i5", "16GB", 1000);
        computador.ligarComputador();
        computador.toString();
    }
}
