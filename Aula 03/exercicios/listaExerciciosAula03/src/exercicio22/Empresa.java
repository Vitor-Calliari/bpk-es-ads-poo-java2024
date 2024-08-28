package exercicio22;

public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar() {
        this.numeroFuncionarios++;
        System.out.println("Um novo funcionário foi contratado. Total de funcionários: " + this.numeroFuncionarios);
    }

    public void demitir() {
        if (this.numeroFuncionarios > 0) {
            this.numeroFuncionarios--;
            System.out.println("Um funcionário foi demitido. Total de funcionários: " + this.numeroFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CNPJ: " + this.CNPJ);
        System.out.println("Número de Funcionários: " + this.numeroFuncionarios);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Java", "12.345.678/0001-99", 50);

        empresa.exibirInformacoes();

        empresa.contratar();

        empresa.demitir();
    }
}
