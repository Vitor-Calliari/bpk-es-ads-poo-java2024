package exercicio19;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda;

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTamanhoRoda(tamanhoRoda);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca não pode ser vazia.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo não pode ser vazio.");
        }
        this.modelo = modelo;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(double tamanhoRoda) {
        if (tamanhoRoda <= 0) {
            throw new IllegalArgumentException("Tamanho da roda deve ser maior que zero.");
        }
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + marca + " modelo " + modelo + ".");
    }

    public void frear() {
        System.out.println("Você está freando a bicicleta " + marca + " modelo " + modelo + ".");
    }
}
