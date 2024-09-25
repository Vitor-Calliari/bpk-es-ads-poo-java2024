package exercicio17;

public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.setEspecie(especie);
        this.setIdade(idade);
        this.setPeso(peso);
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser vazia.");
        }
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public void alimentar(double quantidadeDeComida) {
        if (quantidadeDeComida <= 0) {
            System.out.println("Quantidade de comida inválida.");
        } else {
            this.peso += quantidadeDeComida; // Aumenta o peso do animal
            System.out.println("O animal foi alimentado. Novo peso: " + peso + " kg.");
        }
    }

    public void dormir() {
        System.out.println("O animal está dormindo.");
    }

    public void exibirInformacoes() {
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
    }
}
