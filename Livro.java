public class Livro {
    String nome;
    int ano;
    int numeroPaginas;
    double preco;

    void cadastrar(){
        System.out.println("Cadastrando banco de dados...");
    }

    double calcFrete(String cep){
        System.out.println("Calculando o frete para CEP: " + cep);
        double valorFrete = 5; 
        return valorFrete;
    }
}

