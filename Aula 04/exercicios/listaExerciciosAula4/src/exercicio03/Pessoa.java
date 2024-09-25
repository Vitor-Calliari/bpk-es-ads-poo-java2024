package exercicio03;
/* Implemente uma classe Pessoa com atributos nome, idade, e altura. Adicione um método que imprime uma apresentação da pessoa.
 */

public class Pessoa {
    private String nome;
    private int idade;
    private int alturaEmCm;

    public Pessoa (String nome, int idade, int alturaEmCm){
        this.nome = nome;
        this.idade = idade;
        this.alturaEmCm = alturaEmCm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAlturaEmCm() {
        return alturaEmCm;
    }

    public void setAlturaEmCm(int alturaEmCm) {
        this.alturaEmCm = alturaEmCm;
    }

    public void apresentar(){
        System.out.println("Meu nome é "+nome+", tenho "+idade+" anos e "+alturaEmCm+"cm de altura!");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vitor", 24, 190);
        pessoa.apresentar();
    }

}
