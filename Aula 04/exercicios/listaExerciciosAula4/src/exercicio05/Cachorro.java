package exercicio05;
/*
Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
 */
public class Cachorro {
    private String nome;
    private String raca;
    private int idade;
    private boolean latindo;
    private boolean correndo;

    public Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void latir(){
        if(!latindo){
            latindo = true;
            System.out.println("O cachorro está latindo");
        }
    }
    public void correr(){
        if (!correndo){
            correndo = true;
            System.out.println("O cachorro está correndo");
        }
    }
}
