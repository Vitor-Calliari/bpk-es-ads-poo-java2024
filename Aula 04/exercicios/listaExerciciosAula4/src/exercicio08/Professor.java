package exercicio08;

public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void darAula() {
        System.out.println(nome + " está dando uma aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo as provas de " + disciplina + ".");
    }

    public static void main(String[] args) {
        // Criando uma instância de Professor
        Professor professor = new Professor("Marcelo", "Lógica", 5500.00);

        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: R$ " + professor.getSalario());

    }
}
