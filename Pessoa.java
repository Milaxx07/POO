//4. Crie a classe Pessoa com:
public class Pessoa{

    private final String nome;
    private final int idade;
    private final Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: Rua " + endereco.getRua() + ", N° " + endereco.getNumero());
    }
}