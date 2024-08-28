package exercicio17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void alimentar(double quantidadeDeComida) {
        this.peso += quantidadeDeComida;
        System.out.println("O animal foi alimentado e agora pesa " + this.peso + " kg.");
    }

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Peso: " + this.peso + " kg");
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", 5, 10.5);

        animal.exibirInformacoes();

        animal.alimentar(1.0);

        animal.dormir();
    }
}
