package exercicio11;

class Cidade {
    String nome;
    String estado;
    int populacao;

    public Cidade(String nome, String estado, int populacao) {
        this.nome = nome;
        this.estado = estado;
        this.populacao = populacao;

    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println(quantidade + " pessoas foram adicionadas à população.");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println(quantidade + " pessoas foram removidas da população.");
        } else {
            System.out.println("Quantidade inválida ou população insuficiente.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Estado: " + estado);
        System.out.println("População: " + populacao);

    }
}

public class Main {
    public static void main(String[] args) {
        Cidade cidade = new Cidade("Curitiba", "PR", 5000000);

        cidade.exibirInformacoes();

        cidade.aumentarPopulacao(1000);
        cidade.exibirInformacoes();

        cidade.diminuirPopulacao(500);
        cidade.exibirInformacoes();
    }
}

