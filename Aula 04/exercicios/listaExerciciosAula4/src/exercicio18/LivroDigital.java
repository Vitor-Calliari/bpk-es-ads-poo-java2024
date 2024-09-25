package exercicio18;

public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo;
    private boolean aberto;

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTamanhoArquivo(tamanhoArquivo);
        this.aberto = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser vazio.");
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser vazio.");
        }
        this.autor = autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo <= 0) {
            throw new IllegalArgumentException("Tamanho do arquivo deve ser maior que zero.");
        }
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrirLivro() {
        if (!aberto) {
            aberto = true;
            System.out.println("O livro '" + titulo + "' foi aberto.");
        } else {
            System.out.println("O livro já está aberto.");
        }
    }

    public void fecharLivro() {
        if (aberto) {
            aberto = false;
            System.out.println("O livro '" + titulo + "' foi fechado.");
        } else {
            System.out.println("O livro já está fechado.");
        }
    }
}
