//4. Classe Produto (Setters com Validação)
public final class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        setPreco(preco);
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if (preco < 0){
            System.out.println("Preço inválido, não pode ser negativo");
        }else {
            this.preco = preco;
        }
    }

    public void mostrarInfo(){
        System.out.println("Produto: " + nome + " | Preço: R$ " + preco);
    }
}