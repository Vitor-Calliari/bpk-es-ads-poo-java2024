package exercicio19;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // em MB

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir() {
        System.out.println("O livro \"" + this.titulo + "\" está aberto.");
    }

    public void fechar() {
        System.out.println("O livro \"" + this.titulo + "\" está fechado.");
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Tamanho do arquivo: " + this.tamanhoArquivo + " MB");
    }

    public static void main(String[] args) {
        LivroDigital livro = new LivroDigital("Fogo e Sangue", "George R R Martin", 1.5);

        livro.exibirInformacoes();

        livro.abrir();

        livro.fechar();
    }
}

