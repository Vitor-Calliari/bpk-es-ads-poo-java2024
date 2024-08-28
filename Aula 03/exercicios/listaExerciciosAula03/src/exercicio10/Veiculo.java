package exercicio10;

class Carro {
    String tipo;
    String placa;
    String cor;

    public Carro(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }
    public void abastecer() {
        System.out.println("O veículo de placa " + placa + " foi abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo de placa " + placa + " foi lavado.");
    }
    public void exibirInformacoes() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Placa: " + placa);
        System.out.println("Cor: " + cor);
    }
}

public class Veiculo {
    public static void main(String[] args) {
        Carro carro = new Carro("Mustang", "ABC-1234", "Preto");

        carro.exibirInformacoes();

        carro.abastecer();
        carro.lavar();
    }
}

