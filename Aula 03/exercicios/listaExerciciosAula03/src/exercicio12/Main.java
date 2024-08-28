package exercicio12;

class Filme {
    String titulo;
    String diretor;
    int duracao; // Duração em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme '" + titulo + "' dirigido por " + diretor + " começou. Duração: " + duracao + " minutos.");
    }

    public void parar() {
        System.out.println("O filme '" + titulo + "' foi pausado.");
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Duração: " + duracao + " minutos");
    }
}

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Scarface", "Brian de Palma", 165);

        filme.exibirInformacoes();

        filme.iniciar();
        filme.parar();
    }
}
