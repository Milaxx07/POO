//1. Classe Pessoa (Construtor e Atributos Públicos)
public class MainPessoa {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Ana", 25);
        Pessoa p2 = new Pessoa("Camila", 18);

        System.out.println("Pessoa 1: " + p1.nome + ", " + p1.idade + " anos");
        System.out.println("Pessoa 2: " + p2.nome + ", " + p2.idade + " anos");
    }
}