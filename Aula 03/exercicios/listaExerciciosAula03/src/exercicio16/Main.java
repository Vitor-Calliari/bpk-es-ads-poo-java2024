package exercicio16;

class Loja {
    String nome;
    String endereco;
    String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        System.out.println("A loja '" + nome + "' está agora aberta.");
    }

    public void fechar() {
        System.out.println("A loja '" + nome + "' está agora fechada.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("InfoStore", "Avenida Parigot de Souza, 1550", "(45) 99999-0000");
        loja.exibirInformacoes();

        loja.abrir();
        loja.fechar();
    }
}

