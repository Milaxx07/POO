//4. Crie a classe Livro com:
public class Livro{
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor){
       this.titulo = titulo;
       this.autor = autor;
       this.disponivel = true;
    }

    public String getTitulo(){
        return titulo;
    }

    public void emprestar(){
        if (disponivel){
            disponivel = false;
            System.out.println("O livro: " + titulo + " foi emprestado");
        }else{
           System.out.println("O livro: " + titulo + " já está emprestado");
        }    
    }

    public void devolver(){
        if (!disponivel){
            disponivel = true;
            System.out.println("O livro: " + titulo + " foi devolvido");
        }else{
            System.out.println("O livro: " + titulo + " já estava disponível");
        }
    }

    public void mostrarDados(){
        String status = disponivel ? "Disponível" : "Emprestado";
        System.out.println("Título: " + titulo + " | autor: " + autor + " | Status: " + status);
    }
     
}    
