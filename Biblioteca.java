//4. Crie a classe Livro com:
public class Biblioteca{
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade){
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro){
        if (contador < livros.length){
            livros[contador] = livro;
            contador ++;
            System.out.println("Livro: " + livro.getTitulo() + " adicionado");
        }else{
            System.out.println("Não há espaço para adicionar mais livros");
        }
    }    

    public void emprestarLivro(String titulo){
        for (int i = 0; i < contador; i++){
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)){
                livros[i].emprestar();
                return;
            }
        }
        System.out.println("livro: " + titulo + " não encontrado");
    }

    public void devolverLivro(String titulo){
        for (int i = 0; i < contador; i++){
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)){
                livros[i].devolver();
                return;
            }
        }
        System.out.println("Livro: " + titulo + " não encontrado");
    }

    public void mostrarLivros(){
        System.out.println("\nLista de livros na biblioteca");
        for (int i = 0; i < contador; i++){
            livros[i].mostrarDados();
        }
        System.out.println("------------------------------");
    }
}