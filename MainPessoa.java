//4. Crie a classe Pessoa com:
public class MainPessoa{
    public static void main(String[] args) {
        
        Endereco endereco1 = new Endereco("Rua Yamada", 123);
        Endereco endereco2 = new Endereco("Avenida Brasil", 456);

        Pessoa pessoa1 = new Pessoa("Camila", 18, endereco1);
        Pessoa pessoa2 = new Pessoa("João", 17, endereco2);
        
        pessoa1.mostrarDados();
        pessoa2.mostrarDados();
    }
}