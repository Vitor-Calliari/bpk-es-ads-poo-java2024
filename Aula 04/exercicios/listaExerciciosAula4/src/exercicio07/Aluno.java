package exercicio07;
/*
Implemente uma classe Aluno com atributos nome, matricula, e curso. Adicione um método para calcular a média de notas.
 */
public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularMedia(double[] notas) {
        if (notas == null || notas.length == 0) {
            System.out.println("Nenhuma nota fornecida.");
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public static void main(String[] args) {
        // Criando uma instância de Aluno
        Aluno aluno = new Aluno("Larissa", "20241234", "ADS");

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso());

        double[] notas = {8.5, 7.8, 9.0, 7.5};
        double media = aluno.calcularMedia(notas);

        System.out.println("Média das notas: " + media);
    }
}
