package exercicio03;

//Implemente uma classe Pessoa com atributos nome, idade, e altura.
// Adicione um método que imprime uma apresentação da pessoa.
public class Pessoa {
    public String nome;
    public Integer idade;
    public Integer altura;

    public Pessoa(String nome, Integer idade, Integer altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void apresentar(){
        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos e " + altura + "cm de altura!");
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public Integer getAltura(){
        return altura;
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Vitor", 24, 190);

        pessoa.apresentar();
    }
}
