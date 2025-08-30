//4. Crie a classe Livro com:
public class MainBiblioteca{
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca(5);

        Livro livro1 = new Livro("Dom casmurro", "Machado de assis");
        Livro livro2 = new Livro("A menina que roubava livros", "Markus Zusak");
        Livro livro3 = new Livro("1984", "George Orwell");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.mostrarLivros();

        biblioteca.emprestarLivro("A menina que roubava livros");

        biblioteca.mostrarLivros();

        biblioteca.devolverLivro("A menina que roubava livros");

        biblioteca.mostrarLivros();
    }
}