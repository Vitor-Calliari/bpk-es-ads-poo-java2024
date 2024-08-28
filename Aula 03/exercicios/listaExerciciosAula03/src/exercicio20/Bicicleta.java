package exercicio20;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int tamanhoRoda; // em polegadas

    public Bicicleta(String marca, String modelo, int tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + this.marca + " " + this.modelo;
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + this.marca + " " + this.modelo);
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tamanho da Roda: " + this.tamanhoRoda + " polegadas");
    }

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 29);

        bicicleta.exibirInformacoes();

        bicicleta.pedalar();

        bicicleta.frear();
    }
}

