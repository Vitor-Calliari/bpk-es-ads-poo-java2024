package exercicio05;
//Defina uma classe Cachorro com atributos nome, raca, e idade. Adicione métodos para latir e correr.
public class Cachorro {

    private String nome;
    private String raca;
    private Integer idade;
    private Boolean latir = false;
    private Boolean correr = false;

    public Cachorro(String nome, String raca, Integer idade){
    this.nome = nome;
    this.raca = raca;
    this.idade = idade;
    }

    public void latir(){
        this.latir = true;
        System.out.println(nome + " está latindo!");
    }

    public void correr(){
        this.correr = true;
        System.out.println(nome + " está correndo!");
    }

    public String getNome(){
        return nome;
    }

    public String getRaca(){
        return raca;
    }

    public Integer getIdade(){
        return idade;
    }

    public static void main(String[] args){
        Cachorro cachorro = new Cachorro("Zeus", "Pastor Alemão", 5);
        cachorro.correr();
        cachorro.latir();
    }

}