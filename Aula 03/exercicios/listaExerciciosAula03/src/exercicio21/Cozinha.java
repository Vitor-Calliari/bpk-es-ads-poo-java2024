package exercicio21;

public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("A cozinha está sendo usada para cozinhar.");
    }

    public void limpar() {
        System.out.println("A cozinha está sendo limpa.");
    }

    public void exibirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade de Pessoas: " + this.quantidadePessoas);
        System.out.println("Cor: " + this.cor);
    }

    public static void main(String[] args) {
        Cozinha cozinha = new Cozinha("Moderna", 4, "Creme");

        cozinha.exibirInformacoes();

        cozinha.cozinhar();

        cozinha.limpar();
    }
}

