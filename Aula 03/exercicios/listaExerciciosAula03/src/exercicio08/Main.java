package exercicio08;

class Professor {
    String nome;
    String disciplina;
    double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    public double corrigirProvas(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println(nome + " corrigiu as provas. A média das notas é " + media + ".");
        return media;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Salário: R$" + salario);
    }
}

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Eduardo", "História", 5000.00);

        professor.exibirInformacoes();
        professor.darAula();

        double media = professor.corrigirProvas(7.5, 8.0, 9.0);
        System.out.println("Média final: " + media);
    }
}
