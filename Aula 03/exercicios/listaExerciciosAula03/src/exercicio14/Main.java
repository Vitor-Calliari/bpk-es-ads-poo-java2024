package exercicio14;

class Time {
    String nome;
    String tecnico;
    int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogadores(int quantidade) {
        if (quantidade > 0) {
            numeroDeJogadores += quantidade;
            System.out.println(quantidade + " jogadores foram adicionados ao time.");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void removerJogadores(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println(quantidade + " jogadores foram removidos do time.");
        } else {
            System.out.println("Quantidade inválida ou número insuficiente de jogadores.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome do Time: " + nome);
        System.out.println("Técnico: " + tecnico);
        System.out.println("Número de Jogadores: " + numeroDeJogadores);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Time
        Time time = new Time("Lakers", "JJ Redick", 15);

        time.exibirInformacoes();

        time.adicionarJogadores(3);
        time.exibirInformacoes();

        time.removerJogadores(2);
        time.exibirInformacoes();
    }
}
