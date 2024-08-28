package exercicio09;

class Item {
    String nome;
    double preco;
    int quantidadeEstoque;

    public Item(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println(quantidade + " unidades adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Quantidade inválida ou estoque insuficiente.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}

public class Produto {
    public static void main(String[] args) {
        Item item = new Item("Notebook", 2500.00, 10);

        item.exibirInformacoes();

        item.aumentarEstoque(5);
        item.exibirInformacoes();

        item.diminuirEstoque(3);
        item.exibirInformacoes();
    }
}
