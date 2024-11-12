import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();

       produtos.add(new Produto("Notebook Dell i5", "123456", 4000.00));
       produtos.add(new Produto("Notebook Dell i5", "123456", 4200.00));
       produtos.add(new Produto("Notebook Dell i5", "123456", 4600.00));
       produtos.add(new Produto("Iphone 15 128gb", "00000", 4500.00));
       produtos.add(new Produto("Iphone 15 128gb", "00000", 4800.00));
       produtos.add(new Produto("Teclado Logitech", "54321", 500.00));
       produtos.add(new Produto("Fone JBL", "010101", 300.00));

       List<String> produtosFiltrados = produtos
               .stream()
               .filter(p -> p.getPreco() > 1000)
               .map(p -> p.getNome().toUpperCase())
               .distinct()
               .toList();

       produtosFiltrados.forEach(p -> System.out.println(p));
    }
}