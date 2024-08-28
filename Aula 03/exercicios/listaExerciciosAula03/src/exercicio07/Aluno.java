package exercicio07;

import org.w3c.dom.ls.LSOutput;

//Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.
public class Aluno {
    private String nome;
    private Integer matricula;
    private String curso;
    public double notas[];

    public Aluno(String nome, Integer matricula, String curso, double notas[]){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }
    public double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getNome(){
        return nome;
    }
    public Integer getMatricula(){
        return matricula;
    }
    public String getCurso(){
        return curso;
    }
    public double[] getNotas(){
        return notas;
    }
    public void setNome(){
        this.nome = nome;
    }
    public void setMatricula(){
        this.matricula = matricula;
    }
    public void setCurso(){
        this.curso = curso;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public static void main(String[] args) {
        double[] notas = {8, 7.5, 9, 6.5, 8};
        Aluno aluno = new Aluno("João", 12345, "Nutrição", notas);
        double media = aluno.calcularMedia();
        System.out.println("A média de notas de " + aluno.getNome() + " é: " + media);
    }
}
