package exercicio15;

class Jogo {
    String nome;
    String genero;
    double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("O jogo '" + nome + "' do gênero " + genero + " foi iniciado.");
    }

    public void pausar() {
        System.out.println("O jogo '" + nome + "' foi pausado.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Preço: R$" + preco);
    }
}

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Battlefield 1", "Ação", 99.90);

        jogo.exibirInformacoes();

        jogo.iniciar();
        jogo.pausar();
    }
}

